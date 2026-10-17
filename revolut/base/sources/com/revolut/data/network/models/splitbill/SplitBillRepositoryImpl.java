package com.revolut.data.network.models.splitbill;

import a9j.k;
import com.revolut.data.database.models.splitbill.SplitBillDao;
import com.revolut.data.database.models.splitbill.SplitBillEntity;
import com.revolut.data.database.models.splitbill.mapper.SplitBillEntityMapperKt;
import com.revolut.data.model.Data;
import com.revolut.data.network.models.moneyrequest.SplitBillDtoKt;
import com.revolut.data.network.models.moneyrequest.SplitBillItemDto;
import com.revolut.data.network.models.moneyrequest.SplitBillItemDtoKt;
import com.revolut.data.network.models.moneyrequest.SplittedBillDto;
import com.revolut.data.network.models.splitbill.SplitBillRepositoryImpl;
import com.revolut.data.network.services.SplitBillService;
import com.revolut.domain.models.moneyrequest.SplitBillState;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import efm.h0;
import efm.r;
import ehe.n;
import gim.d;
import gim.i;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kii.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineScope;
import ne0.j;
import net.sf.scuba.smartcards.ISO7816;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import qe0.s;
import qfm.r0;
import skm.e0;
import skm.p0;
import v61.h;
import w4l.f;
import yhm.o;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 I2\u00020\u0001:\u0002JIB9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00190\u00180\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\"0\u00180\u00172\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u0018\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b'\u0010(J#\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00190\u00172\u0006\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b*\u0010+J+\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00190\u00172\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0007H\u0016¢\u0006\u0004\b-\u0010.J-\u00101\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u0013\u00107\u001a\u00020\u0015*\u00020\u0012H\u0002¢\u0006\u0004\b7\u00108J%\u00109\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u00072\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0002¢\u0006\u0004\b9\u0010:J\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00070\u00192\u0006\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010>R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010?R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010@R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020&0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR&\u0010E\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00190D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR&\u0010G\u001a\u0014\u0012\u0004\u0012\u000203\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00190D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010FR&\u0010H\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00190D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010F¨\u0006K"}, d2 = {"Lcom/revolut/data/network/models/splitbill/SplitBillRepositoryImpl;", "Lu71/a;", "Lcom/revolut/data/network/services/SplitBillService;", "splitBillService", "Lcom/revolut/data/database/models/splitbill/SplitBillDao;", "splitBillDao", "Lne0/j;", "", "memoryCache", "Lue0/c;", "splitBillStorage", "Lze0/a;", "forceReloadStrategyFactory", "<init>", "(Lcom/revolut/data/network/services/SplitBillService;Lcom/revolut/data/database/models/splitbill/SplitBillDao;Lne0/j;Lue0/c;Lze0/a;)V", "Lv61/j;", "transactionsMoneyDataToSplit", "Lefm/d0;", "Lv61/h;", "splitBill", "(Lv61/j;)Lefm/d0;", "", "forceReload", "Lefm/r;", "Lcom/revolut/data/model/Data;", "", "observeSplitBills", "(Z)Lefm/r;", "id", "Lefm/b;", "cancelSplitBill", "(Ljava/lang/String;)Lefm/b;", "Lk71/i;", "transactionDescriptor", "Lod0/i;", "observeSplitBillForTransaction", "(Lk71/i;)Lefm/r;", "transactionId", "", "fetchSplitBillForTransaction", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lv61/c;", "getSplitBillDetailsForPayer", "(Ljava/lang/String;)Lefm/r;", "moneyRequestId", "getSplitBillDetailsForRequestor", "(Ljava/lang/String;Ljava/lang/String;)Lefm/r;", "billId", "moneyRequestIds", "deleteSplitBillReceipt", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lefm/b;", "Lcom/revolut/data/network/models/splitbill/SplitBillRepositoryImpl$SplitBillDetailsForRequestorParams;", "params", "splitBillDetailsForRequestorKey", "(Lcom/revolut/data/network/models/splitbill/SplitBillRepositoryImpl$SplitBillDetailsForRequestorParams;)Ljava/lang/String;", "isEligible", "(Lv61/h;)Z", "reloadSplitBillsAndRequestorDetails", "(Ljava/lang/String;Ljava/util/List;)Lefm/b;", "siblingMoneyRequestIds", "(Ljava/lang/String;)Ljava/util/List;", "Lcom/revolut/data/network/services/SplitBillService;", "Lcom/revolut/data/database/models/splitbill/SplitBillDao;", "Lne0/j;", "Lue0/c;", "Lqe0/s;", "forceReloadStrategy", "Lqe0/s;", "Lw4l/f;", "splitBillObservableDelegate", "Lw4l/f;", "getSplitBillDetailsForRequestorObservableDelegate", "getSplitBillDetailsForPayerObservableDelegate", "Companion", "SplitBillDetailsForRequestorParams", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SplitBillRepositoryImpl implements u71.a {
    private static final long DEFAULT_TIMESTAMP = 0;
    private static final long FORCE_RELOAD_TTL_MILLIS = 180000;
    private static final int MAX_CONCURRENT_REQUESTOR_DETAILS_RELOADS = 4;

    @NotNull
    private final s forceReloadStrategy;

    @NotNull
    private final f getSplitBillDetailsForPayerObservableDelegate;

    @NotNull
    private final f getSplitBillDetailsForRequestorObservableDelegate;

    @NotNull
    private final j memoryCache;

    @NotNull
    private final SplitBillDao splitBillDao;

    @NotNull
    private final f splitBillObservableDelegate;

    @NotNull
    private final SplitBillService splitBillService;

    @NotNull
    private final ue0.c splitBillStorage;

    @NotNull
    private static final String KEY_SPLIT_BILLS = "split_bill";

    @NotNull
    private static final String KEY_DETAILS_PAYER = "split_bill_details_payer";

    @NotNull
    private static final String KEY_DETAILS_REQ = "split_bill_details_requestor";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/revolut/data/network/models/splitbill/SplitBillRepositoryImpl$Companion;", "", "<init>", "()V", "DEFAULT_TIMESTAMP", "", "FORCE_RELOAD_TTL_MILLIS", "MAX_CONCURRENT_REQUESTOR_DETAILS_RELOADS", "", "KEY_SPLIT_BILLS", "", "KEY_DETAILS_PAYER", "KEY_DETAILS_REQ", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/revolut/data/network/models/splitbill/SplitBillRepositoryImpl$SplitBillDetailsForRequestorParams;", "", "id", "", "moneyRequestId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getMoneyRequestId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SplitBillDetailsForRequestorParams {

        @NotNull
        private final String id;

        @NotNull
        private final String moneyRequestId;

        public SplitBillDetailsForRequestorParams(@NotNull String id10, @NotNull String moneyRequestId) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(moneyRequestId, "moneyRequestId");
            this.id = id10;
            this.moneyRequestId = moneyRequestId;
        }

        public static /* synthetic */ SplitBillDetailsForRequestorParams copy$default(SplitBillDetailsForRequestorParams splitBillDetailsForRequestorParams, String str, String str2, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = splitBillDetailsForRequestorParams.id;
            }
            if ((i & 2) != 0) {
                str2 = splitBillDetailsForRequestorParams.moneyRequestId;
            }
            return splitBillDetailsForRequestorParams.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMoneyRequestId() {
            return this.moneyRequestId;
        }

        @NotNull
        public final SplitBillDetailsForRequestorParams copy(@NotNull String id10, @NotNull String moneyRequestId) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(moneyRequestId, "moneyRequestId");
            return new SplitBillDetailsForRequestorParams(id10, moneyRequestId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SplitBillDetailsForRequestorParams)) {
                return false;
            }
            SplitBillDetailsForRequestorParams splitBillDetailsForRequestorParams = (SplitBillDetailsForRequestorParams) other;
            return Intrinsics.f(this.id, splitBillDetailsForRequestorParams.id) && Intrinsics.f(this.moneyRequestId, splitBillDetailsForRequestorParams.moneyRequestId);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final String getMoneyRequestId() {
            return this.moneyRequestId;
        }

        public int hashCode() {
            return this.moneyRequestId.hashCode() + (this.id.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: com.revolut.data.network.models.splitbill.SplitBillRepositoryImpl$fetchSplitBillForTransaction$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes20.dex */
    @d(c = "com.revolut.data.network.models.splitbill.SplitBillRepositoryImpl$fetchSplitBillForTransaction$2", f = "SplitBillRepositoryImpl.kt", l = {ISO7816.TAG_SM_EXPECTED_LENGTH}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $transactionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$transactionId = str;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return SplitBillRepositoryImpl.this.new AnonymousClass2(this.$transactionId, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            Object next;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                d0<List<SplittedBillDto>> splitBillsOld = SplitBillRepositoryImpl.this.splitBillService.getSplitBillsOld(0L);
                this.label = 1;
                obj2 = nim.a.b(splitBillsOld, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            List list = (List) obj2;
            Intrinsics.h(list);
            List list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(SplitBillDtoKt.toDomain((SplittedBillDto) it8.next()));
            }
            SplitBillRepositoryImpl splitBillRepositoryImpl = SplitBillRepositoryImpl.this;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (splitBillRepositoryImpl.isEligible((h) obj3)) {
                    arrayList2.add(obj3);
                }
            }
            String str = this.$transactionId;
            Iterator it9 = arrayList2.iterator();
            loop2: while (true) {
                if (!it9.hasNext()) {
                    next = null;
                    break;
                }
                next = it9.next();
                ArrayList arrayList3 = ((h) next).f;
                if (!arrayList3.isEmpty()) {
                    Iterator it10 = arrayList3.iterator();
                    while (it10.hasNext()) {
                        if (Intrinsics.f(((v61.i) it10.next()).f286295c, str)) {
                            break loop2;
                        }
                    }
                }
            }
            if (((h) next) == null) {
                throw new NoSuchElementException(j6.a.q("Split bill not found for transaction ", this.$transactionId));
            }
            f fVar = SplitBillRepositoryImpl.this.splitBillObservableDelegate;
            Unit unit = Unit.f186387a;
            fVar.j(unit, arrayList2);
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.revolut.data.network.models.splitbill.SplitBillRepositoryImpl$splitBill$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class AnonymousClass1 extends q implements Function1<SplittedBillDto, h> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1, SplitBillDtoKt.class, "toDomain", "toDomain(Lcom/revolut/data/network/models/moneyrequest/SplittedBillDto;)Lcom/revolut/domain/models/moneyrequest/SplittedBill;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final h invoke(SplittedBillDto p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return SplitBillDtoKt.toDomain(p0);
        }
    }

    public SplitBillRepositoryImpl(@NotNull SplitBillService splitBillService, @NotNull SplitBillDao splitBillDao, @NotNull j memoryCache, @NotNull ue0.c splitBillStorage, @NotNull ze0.a forceReloadStrategyFactory) {
        Intrinsics.checkNotNullParameter(splitBillService, "splitBillService");
        Intrinsics.checkNotNullParameter(splitBillDao, "splitBillDao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(splitBillStorage, "splitBillStorage");
        Intrinsics.checkNotNullParameter(forceReloadStrategyFactory, "forceReloadStrategyFactory");
        this.splitBillService = splitBillService;
        this.splitBillDao = splitBillDao;
        this.memoryCache = memoryCache;
        this.splitBillStorage = splitBillStorage;
        this.forceReloadStrategy = ((ze0.c) forceReloadStrategyFactory).b(FORCE_RELOAD_TTL_MILLIS);
        final int i = 4;
        final int i2 = 7;
        final int i3 = 3;
        this.splitBillObservableDelegate = new f(new Function2(this) { // from class: com.revolut.data.network.models.splitbill.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplitBillRepositoryImpl f60225b;

            {
                this.f60225b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$0(this.f60225b, (f) obj2, (SplitBillRepositoryImpl.SplitBillDetailsForRequestorParams) obj3);
                    case 1:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$2(this.f60225b, (SplitBillRepositoryImpl.SplitBillDetailsForRequestorParams) obj2, (List) obj3);
                    case 2:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$4(this.f60225b, (SplitBillRepositoryImpl.SplitBillDetailsForRequestorParams) obj2, (List) obj3);
                    case 3:
                        return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$4(this.f60225b, (Unit) obj2, (List) obj3);
                    case 4:
                        return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$0(this.f60225b, (f) obj2, (Unit) obj3);
                    case 5:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForPayerObservableDelegate$lambda$0(this.f60225b, (f) obj2, (String) obj3);
                    case 6:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForPayerObservableDelegate$lambda$2(this.f60225b, (String) obj2, (List) obj3);
                    default:
                        return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$2(this.f60225b, (Unit) obj2, (List) obj3);
                }
            }
        }, new b(this, 6), new Function2(this) { // from class: com.revolut.data.network.models.splitbill.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplitBillRepositoryImpl f60225b;

            {
                this.f60225b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$0(this.f60225b, (f) obj2, (SplitBillRepositoryImpl.SplitBillDetailsForRequestorParams) obj3);
                    case 1:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$2(this.f60225b, (SplitBillRepositoryImpl.SplitBillDetailsForRequestorParams) obj2, (List) obj3);
                    case 2:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$4(this.f60225b, (SplitBillRepositoryImpl.SplitBillDetailsForRequestorParams) obj2, (List) obj3);
                    case 3:
                        return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$4(this.f60225b, (Unit) obj2, (List) obj3);
                    case 4:
                        return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$0(this.f60225b, (f) obj2, (Unit) obj3);
                    case 5:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForPayerObservableDelegate$lambda$0(this.f60225b, (f) obj2, (String) obj3);
                    case 6:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForPayerObservableDelegate$lambda$2(this.f60225b, (String) obj2, (List) obj3);
                    default:
                        return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$2(this.f60225b, (Unit) obj2, (List) obj3);
                }
            }
        }, new b(this, 2), new Function2(this) { // from class: com.revolut.data.network.models.splitbill.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplitBillRepositoryImpl f60225b;

            {
                this.f60225b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$0(this.f60225b, (f) obj2, (SplitBillRepositoryImpl.SplitBillDetailsForRequestorParams) obj3);
                    case 1:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$2(this.f60225b, (SplitBillRepositoryImpl.SplitBillDetailsForRequestorParams) obj2, (List) obj3);
                    case 2:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$4(this.f60225b, (SplitBillRepositoryImpl.SplitBillDetailsForRequestorParams) obj2, (List) obj3);
                    case 3:
                        return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$4(this.f60225b, (Unit) obj2, (List) obj3);
                    case 4:
                        return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$0(this.f60225b, (f) obj2, (Unit) obj3);
                    case 5:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForPayerObservableDelegate$lambda$0(this.f60225b, (f) obj2, (String) obj3);
                    case 6:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForPayerObservableDelegate$lambda$2(this.f60225b, (String) obj2, (List) obj3);
                    default:
                        return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$2(this.f60225b, (Unit) obj2, (List) obj3);
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 0;
        Function2 function2 = new Function2(this) { // from class: com.revolut.data.network.models.splitbill.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplitBillRepositoryImpl f60225b;

            {
                this.f60225b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$0(this.f60225b, (f) obj2, (SplitBillRepositoryImpl.SplitBillDetailsForRequestorParams) obj3);
                    case 1:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$2(this.f60225b, (SplitBillRepositoryImpl.SplitBillDetailsForRequestorParams) obj2, (List) obj3);
                    case 2:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$4(this.f60225b, (SplitBillRepositoryImpl.SplitBillDetailsForRequestorParams) obj2, (List) obj3);
                    case 3:
                        return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$4(this.f60225b, (Unit) obj2, (List) obj3);
                    case 4:
                        return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$0(this.f60225b, (f) obj2, (Unit) obj3);
                    case 5:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForPayerObservableDelegate$lambda$0(this.f60225b, (f) obj2, (String) obj3);
                    case 6:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForPayerObservableDelegate$lambda$2(this.f60225b, (String) obj2, (List) obj3);
                    default:
                        return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$2(this.f60225b, (Unit) obj2, (List) obj3);
                }
            }
        };
        b bVar = new b(this, i5);
        final int i6 = 1;
        Function2 function22 = new Function2(this) { // from class: com.revolut.data.network.models.splitbill.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplitBillRepositoryImpl f60225b;

            {
                this.f60225b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$0(this.f60225b, (f) obj2, (SplitBillRepositoryImpl.SplitBillDetailsForRequestorParams) obj3);
                    case 1:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$2(this.f60225b, (SplitBillRepositoryImpl.SplitBillDetailsForRequestorParams) obj2, (List) obj3);
                    case 2:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$4(this.f60225b, (SplitBillRepositoryImpl.SplitBillDetailsForRequestorParams) obj2, (List) obj3);
                    case 3:
                        return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$4(this.f60225b, (Unit) obj2, (List) obj3);
                    case 4:
                        return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$0(this.f60225b, (f) obj2, (Unit) obj3);
                    case 5:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForPayerObservableDelegate$lambda$0(this.f60225b, (f) obj2, (String) obj3);
                    case 6:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForPayerObservableDelegate$lambda$2(this.f60225b, (String) obj2, (List) obj3);
                    default:
                        return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$2(this.f60225b, (Unit) obj2, (List) obj3);
                }
            }
        };
        b bVar2 = new b(this, i6);
        final int i21 = 2;
        this.getSplitBillDetailsForRequestorObservableDelegate = new f(function2, bVar, function22, bVar2, new Function2(this) { // from class: com.revolut.data.network.models.splitbill.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplitBillRepositoryImpl f60225b;

            {
                this.f60225b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$0(this.f60225b, (f) obj2, (SplitBillRepositoryImpl.SplitBillDetailsForRequestorParams) obj3);
                    case 1:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$2(this.f60225b, (SplitBillRepositoryImpl.SplitBillDetailsForRequestorParams) obj2, (List) obj3);
                    case 2:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$4(this.f60225b, (SplitBillRepositoryImpl.SplitBillDetailsForRequestorParams) obj2, (List) obj3);
                    case 3:
                        return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$4(this.f60225b, (Unit) obj2, (List) obj3);
                    case 4:
                        return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$0(this.f60225b, (f) obj2, (Unit) obj3);
                    case 5:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForPayerObservableDelegate$lambda$0(this.f60225b, (f) obj2, (String) obj3);
                    case 6:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForPayerObservableDelegate$lambda$2(this.f60225b, (String) obj2, (List) obj3);
                    default:
                        return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$2(this.f60225b, (Unit) obj2, (List) obj3);
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i22 = 5;
        Function2 function23 = new Function2(this) { // from class: com.revolut.data.network.models.splitbill.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplitBillRepositoryImpl f60225b;

            {
                this.f60225b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$0(this.f60225b, (f) obj2, (SplitBillRepositoryImpl.SplitBillDetailsForRequestorParams) obj3);
                    case 1:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$2(this.f60225b, (SplitBillRepositoryImpl.SplitBillDetailsForRequestorParams) obj2, (List) obj3);
                    case 2:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$4(this.f60225b, (SplitBillRepositoryImpl.SplitBillDetailsForRequestorParams) obj2, (List) obj3);
                    case 3:
                        return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$4(this.f60225b, (Unit) obj2, (List) obj3);
                    case 4:
                        return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$0(this.f60225b, (f) obj2, (Unit) obj3);
                    case 5:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForPayerObservableDelegate$lambda$0(this.f60225b, (f) obj2, (String) obj3);
                    case 6:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForPayerObservableDelegate$lambda$2(this.f60225b, (String) obj2, (List) obj3);
                    default:
                        return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$2(this.f60225b, (Unit) obj2, (List) obj3);
                }
            }
        };
        b bVar3 = new b(this, i22);
        final int i32 = 6;
        this.getSplitBillDetailsForPayerObservableDelegate = new f(function23, bVar3, new Function2(this) { // from class: com.revolut.data.network.models.splitbill.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplitBillRepositoryImpl f60225b;

            {
                this.f60225b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$0(this.f60225b, (f) obj2, (SplitBillRepositoryImpl.SplitBillDetailsForRequestorParams) obj3);
                    case 1:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$2(this.f60225b, (SplitBillRepositoryImpl.SplitBillDetailsForRequestorParams) obj2, (List) obj3);
                    case 2:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate$lambda$4(this.f60225b, (SplitBillRepositoryImpl.SplitBillDetailsForRequestorParams) obj2, (List) obj3);
                    case 3:
                        return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$4(this.f60225b, (Unit) obj2, (List) obj3);
                    case 4:
                        return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$0(this.f60225b, (f) obj2, (Unit) obj3);
                    case 5:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForPayerObservableDelegate$lambda$0(this.f60225b, (f) obj2, (String) obj3);
                    case 6:
                        return SplitBillRepositoryImpl.getSplitBillDetailsForPayerObservableDelegate$lambda$2(this.f60225b, (String) obj2, (List) obj3);
                    default:
                        return SplitBillRepositoryImpl.splitBillObservableDelegate$lambda$2(this.f60225b, (Unit) obj2, (List) obj3);
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 getSplitBillDetailsForPayerObservableDelegate$lambda$0(SplitBillRepositoryImpl splitBillRepositoryImpl, f DataObservableDelegate, String id10) {
        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
        Intrinsics.checkNotNullParameter(id10, "id");
        d0<List<SplitBillItemDto>> splitBillDetailsForPayer = splitBillRepositoryImpl.splitBillService.getSplitBillDetailsForPayer(id10);
        c cVar = new c(4, new cmc.c(27));
        splitBillDetailsForPayer.getClass();
        ufm.i iVar = new ufm.i(splitBillDetailsForPayer, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getSplitBillDetailsForPayerObservableDelegate$lambda$0$0(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        List list = items;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(SplitBillItemDtoKt.toDomain((SplitBillItemDto) it8.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getSplitBillDetailsForPayerObservableDelegate$lambda$0$1(Function1 function1, Object p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (List) function1.invoke(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getSplitBillDetailsForPayerObservableDelegate$lambda$1(SplitBillRepositoryImpl splitBillRepositoryImpl, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return (List) v7.r("split_bill_details_payer_", id10, splitBillRepositoryImpl.memoryCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSplitBillDetailsForPayerObservableDelegate$lambda$2(SplitBillRepositoryImpl splitBillRepositoryImpl, String id10, List value) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        n.z("split_bill_details_payer_", id10, splitBillRepositoryImpl.memoryCache, value);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable getSplitBillDetailsForRequestor$lambda$0(Throwable error, List list) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (list == null) {
            return error;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 getSplitBillDetailsForRequestorObservableDelegate$lambda$0(SplitBillRepositoryImpl splitBillRepositoryImpl, f DataObservableDelegate, SplitBillDetailsForRequestorParams params) {
        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
        Intrinsics.checkNotNullParameter(params, "params");
        d0<List<SplitBillItemDto>> splitBillDetailsForRequestor = splitBillRepositoryImpl.splitBillService.getSplitBillDetailsForRequestor(params.getId(), params.getMoneyRequestId());
        c cVar = new c(5, new cmc.c(28));
        splitBillDetailsForRequestor.getClass();
        ufm.i iVar = new ufm.i(splitBillDetailsForRequestor, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getSplitBillDetailsForRequestorObservableDelegate$lambda$0$0(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        List list = items;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(SplitBillItemDtoKt.toDomain((SplitBillItemDto) it8.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getSplitBillDetailsForRequestorObservableDelegate$lambda$0$1(Function1 function1, Object p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (List) function1.invoke(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getSplitBillDetailsForRequestorObservableDelegate$lambda$1(SplitBillRepositoryImpl splitBillRepositoryImpl, SplitBillDetailsForRequestorParams it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return (List) splitBillRepositoryImpl.memoryCache.get(splitBillRepositoryImpl.splitBillDetailsForRequestorKey(it8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSplitBillDetailsForRequestorObservableDelegate$lambda$2(SplitBillRepositoryImpl splitBillRepositoryImpl, SplitBillDetailsForRequestorParams params, List value) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(value, "value");
        splitBillRepositoryImpl.memoryCache.f(splitBillRepositoryImpl.splitBillDetailsForRequestorKey(params), value);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getSplitBillDetailsForRequestorObservableDelegate$lambda$3(SplitBillRepositoryImpl splitBillRepositoryImpl, SplitBillDetailsForRequestorParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        List list = (List) p.a.j(SplitBillItemDto.class, KTypeProjection.INSTANCE, List.class, splitBillRepositoryImpl.splitBillStorage, splitBillRepositoryImpl.splitBillDetailsForRequestorKey(params));
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(SplitBillItemDtoKt.toDomain((SplitBillItemDto) it8.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSplitBillDetailsForRequestorObservableDelegate$lambda$4(SplitBillRepositoryImpl splitBillRepositoryImpl, SplitBillDetailsForRequestorParams params, List items) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(items, "items");
        ue0.c cVar = splitBillRepositoryImpl.splitBillStorage;
        String strSplitBillDetailsForRequestorKey = splitBillRepositoryImpl.splitBillDetailsForRequestorKey(params);
        List list = items;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(SplitBillItemDtoKt.toDto((v61.c) it8.next()));
        }
        cVar.G(arrayList, strSplitBillDetailsForRequestorKey, e.o(SplitBillItemDto.class, KTypeProjection.INSTANCE, List.class));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isEligible(h hVar) {
        return (hVar.c() == SplitBillState.CANCELLED || hVar.a().isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final od0.i observeSplitBillForTransaction$lambda$0(k71.i iVar, List splittedBills) {
        Object next;
        Intrinsics.checkNotNullParameter(splittedBills, "splittedBills");
        Iterator it8 = splittedBills.iterator();
        loop0: while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            List listB = ((h) next).b();
            if (!listB.isEmpty()) {
                Iterator it9 = listB.iterator();
                while (it9.hasNext()) {
                    if (Intrinsics.f(((v61.i) it9.next()).a(), iVar.a())) {
                        break loop0;
                    }
                }
            }
        }
        od0.i.Companion.getClass();
        return od0.h.a((h) next);
    }

    private final efm.b reloadSplitBillsAndRequestorDetails(String id10, List<String> moneyRequestIds) {
        pfm.a aVarE = ue0.e.v(this.splitBillObservableDelegate.g(Unit.f186387a, true)).e(new pfm.h(new k(moneyRequestIds, 5, this, id10), 1));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final efm.f reloadSplitBillsAndRequestorDetails$lambda$0(List list, SplitBillRepositoryImpl splitBillRepositoryImpl, String str) {
        r0 r0VarG = efm.i.h(zhm.d0.U(zhm.d0.E0(splitBillRepositoryImpl.siblingMoneyRequestIds(str), list))).g(new c(3, new cma.b(splitBillRepositoryImpl, str, 11)), 4);
        Intrinsics.checkNotNullExpressionValue(r0VarG, "flatMapCompletable(...)");
        return ue0.e.v(r0VarG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final efm.f reloadSplitBillsAndRequestorDetails$lambda$0$0(SplitBillRepositoryImpl splitBillRepositoryImpl, String str, String moneyRequestId) {
        Intrinsics.checkNotNullParameter(moneyRequestId, "moneyRequestId");
        return ue0.e.v(splitBillRepositoryImpl.getSplitBillDetailsForRequestorObservableDelegate.g(new SplitBillDetailsForRequestorParams(str, moneyRequestId), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final efm.f reloadSplitBillsAndRequestorDetails$lambda$0$1(Function1 function1, Object p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (efm.f) function1.invoke(p0);
    }

    private final List<String> siblingMoneyRequestIds(String id10) {
        Object next;
        List list = (List) this.memoryCache.get("split_bill");
        ArrayList arrayList = null;
        if (list != null) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((h) next).getId(), id10)) {
                    break;
                }
            }
            h hVar = (h) next;
            if (hVar != null) {
                List listA = hVar.a();
                arrayList = new ArrayList();
                Iterator it9 = listA.iterator();
                while (it9.hasNext()) {
                    String strA = ((v61.d) it9.next()).a();
                    if (strA != null) {
                        arrayList.add(strA);
                    }
                }
            }
        }
        return arrayList == null ? f0.f322471a : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h splitBill$lambda$0(Function1 function1, Object p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (h) function1.invoke(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 splitBill$lambda$1(SplitBillRepositoryImpl splitBillRepositoryImpl, h splitBill) {
        Intrinsics.checkNotNullParameter(splitBill, "splitBill");
        return splitBillRepositoryImpl.splitBillObservableDelegate.g(Unit.f186387a, false).f(d0.m(splitBill));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 splitBill$lambda$2(Function1 function1, Object p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (h0) function1.invoke(p0);
    }

    private final String splitBillDetailsForRequestorKey(SplitBillDetailsForRequestorParams params) {
        return a0.d.s("split_bill_details_requestor_", params.getId(), "_", params.getMoneyRequestId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 splitBillObservableDelegate$lambda$0(SplitBillRepositoryImpl splitBillRepositoryImpl, f DataObservableDelegate, Unit it8) {
        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
        Intrinsics.checkNotNullParameter(it8, "it");
        d0<List<SplittedBillDto>> splitBillsOld = splitBillRepositoryImpl.splitBillService.getSplitBillsOld(0L);
        c cVar = new c(2, new b(splitBillRepositoryImpl, 4));
        splitBillsOld.getClass();
        ufm.i iVar = new ufm.i(splitBillsOld, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List splitBillObservableDelegate$lambda$0$0(SplitBillRepositoryImpl splitBillRepositoryImpl, List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        splitBillRepositoryImpl.forceReloadStrategy.f(Unit.f186387a);
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(SplitBillDtoKt.toDomain((SplittedBillDto) it8.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (splitBillRepositoryImpl.isEligible((h) obj2)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List splitBillObservableDelegate$lambda$0$1(Function1 function1, Object p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (List) function1.invoke(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List splitBillObservableDelegate$lambda$1(SplitBillRepositoryImpl splitBillRepositoryImpl, Unit it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return (List) splitBillRepositoryImpl.memoryCache.get("split_bill");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit splitBillObservableDelegate$lambda$2(SplitBillRepositoryImpl splitBillRepositoryImpl, Unit unit, List updateSplittedBills) {
        Intrinsics.checkNotNullParameter(unit, "<unused var>");
        Intrinsics.checkNotNullParameter(updateSplittedBills, "updateSplittedBills");
        splitBillRepositoryImpl.memoryCache.f("split_bill", updateSplittedBills);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List splitBillObservableDelegate$lambda$3(SplitBillRepositoryImpl splitBillRepositoryImpl, Unit it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        List<SplitBillEntity> listSplitBills = splitBillRepositoryImpl.splitBillDao.splitBills();
        ArrayList arrayList = new ArrayList(w.t(listSplitBills, 10));
        Iterator<T> it9 = listSplitBills.iterator();
        while (it9.hasNext()) {
            arrayList.add(SplitBillEntityMapperKt.toDomain((SplitBillEntity) it9.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit splitBillObservableDelegate$lambda$4(SplitBillRepositoryImpl splitBillRepositoryImpl, Unit unit, List updateSplittedBills) {
        Intrinsics.checkNotNullParameter(unit, "<unused var>");
        Intrinsics.checkNotNullParameter(updateSplittedBills, "updateSplittedBills");
        SplitBillDao splitBillDao = splitBillRepositoryImpl.splitBillDao;
        List list = updateSplittedBills;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(SplitBillEntityMapperKt.toEntity((h) it8.next()));
        }
        splitBillDao.replaceAll(arrayList);
        return Unit.f186387a;
    }

    @Override // u71.a
    @NotNull
    public efm.b cancelSplitBill(@NotNull String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        pfm.a aVarE = this.splitBillService.cancelSplitBill(id10).e(this.splitBillObservableDelegate.g(Unit.f186387a, false));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return te0.w.g0(aVarE);
    }

    @Override // u71.a
    @NotNull
    public efm.b deleteSplitBillReceipt(@NotNull String id10, @NotNull String billId, @NotNull List<String> moneyRequestIds) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(billId, "billId");
        Intrinsics.checkNotNullParameter(moneyRequestIds, "moneyRequestIds");
        pfm.a aVarE = this.splitBillService.deleteSplitBillReceipt(id10, billId).e(reloadSplitBillsAndRequestorDetails(id10, moneyRequestIds));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return te0.w.g0(aVarE);
    }

    @Override // u71.a
    public Object fetchSplitBillForTransaction(@NotNull String str, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(str, null);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, anonymousClass2, continuation);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    @Override // u71.a
    @NotNull
    public r<List<v61.c>> getSplitBillDetailsForPayer(@NotNull String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return m70.a.g(this.getSplitBillDetailsForPayerObservableDelegate.f(id10, false), null, null, 3);
    }

    @Override // u71.a
    @NotNull
    public r<List<v61.c>> getSplitBillDetailsForRequestor(@NotNull String id10, @NotNull String moneyRequestId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(moneyRequestId, "moneyRequestId");
        return m70.a.g(ue0.e.p(this.getSplitBillDetailsForRequestorObservableDelegate.f(new SplitBillDetailsForRequestorParams(id10, moneyRequestId), false), zhm.h0.f322473a), null, new clk.b(15), 1);
    }

    @Override // u71.a
    @NotNull
    public r<Data<od0.i>> observeSplitBillForTransaction(@NotNull k71.i transactionDescriptor) {
        Intrinsics.checkNotNullParameter(transactionDescriptor, "transactionDescriptor");
        return nim.a.w(this.splitBillObservableDelegate.e(Unit.f186387a, w4l.i.f294643c), new b(transactionDescriptor, 7));
    }

    @Override // u71.a
    @NotNull
    public r<Data<List<h>>> observeSplitBills(boolean forceReload) {
        f fVar = this.splitBillObservableDelegate;
        Unit unit = Unit.f186387a;
        return fVar.f(unit, this.forceReloadStrategy.a(unit, forceReload));
    }

    @Override // u71.a
    @NotNull
    public d0<h> splitBill(@NotNull v61.j transactionsMoneyDataToSplit) {
        Intrinsics.checkNotNullParameter(transactionsMoneyDataToSplit, "transactionsMoneyDataToSplit");
        d0<SplittedBillDto> d0VarPostSplitBillOld = this.splitBillService.postSplitBillOld(SplitBillDtoKt.toDto(transactionsMoneyDataToSplit));
        c cVar = new c(0, AnonymousClass1.INSTANCE);
        d0VarPostSplitBillOld.getClass();
        ufm.i iVar = new ufm.i(new ufm.i(d0VarPostSplitBillOld, cVar, 1), new c(1, new b(this, 3)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}

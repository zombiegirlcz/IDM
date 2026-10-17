package xif;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.transactions.impl.data.network.RecallableService;
import efm.d0;
import ip0.v7;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import tof.x5;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();
    public static final Type e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecallableService f306357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f306358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f306359c;
    public final w4l.f d;

    static {
        Type type = new TypeToken<jif.c>() { // from class: com.revolut.feature.transactions.impl.data.repository.RecallableRepositoryImpl$Companion$TRANSACTION_CANCELLABLE_DTO_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        e = type;
    }

    public i(RecallableService recallableService, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(recallableService, "recallableService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f306357a = recallableService;
        this.f306358b = memoryCache;
        this.f306359c = storage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: xif.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f306354b;

            {
                this.f306354b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String groupId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        d0<jif.c> d0VarIsTransactionRecallableById = this.f306354b.f306357a.isTransactionRecallableById(groupId);
                        xg6.k kVar = new xg6.k(new c(1), 14);
                        d0VarIsTransactionRecallableById.getClass();
                        ufm.i iVar = new ufm.i(d0VarIsTransactionRecallableById, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String groupId2 = (String) obj2;
                        x5 recallable = (x5) obj3;
                        Intrinsics.checkNotNullParameter(groupId2, "groupId");
                        Intrinsics.checkNotNullParameter(recallable, "recallable");
                        this.f306354b.f306358b.f("PREF_KEY_TRANSACTION_CANCELLABLE" + groupId2, recallable);
                        break;
                    default:
                        String groupId3 = (String) obj2;
                        x5 recallable2 = (x5) obj3;
                        Intrinsics.checkNotNullParameter(groupId3, "groupId");
                        Intrinsics.checkNotNullParameter(recallable2, "recallable");
                        Intrinsics.checkNotNullParameter(recallable2, "<this>");
                        this.f306354b.f306359c.G(new jif.c(recallable2.f273160a), "PREF_KEY_TRANSACTION_CANCELLABLE" + groupId3, wim.z.d(o0.b(jif.c.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: xif.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f306356b;

            {
                this.f306356b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String groupId = (String) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        return (x5) v7.r("PREF_KEY_TRANSACTION_CANCELLABLE", groupId, this.f306356b.f306358b);
                    default:
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        jif.c cVar = (jif.c) this.f306356b.f306359c.T2(j6.a.q("PREF_KEY_TRANSACTION_CANCELLABLE", groupId), i.e);
                        if (cVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        return new x5(cVar.getCancellable());
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: xif.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f306354b;

            {
                this.f306354b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String groupId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        d0<jif.c> d0VarIsTransactionRecallableById = this.f306354b.f306357a.isTransactionRecallableById(groupId);
                        xg6.k kVar = new xg6.k(new c(1), 14);
                        d0VarIsTransactionRecallableById.getClass();
                        ufm.i iVar = new ufm.i(d0VarIsTransactionRecallableById, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String groupId2 = (String) obj2;
                        x5 recallable = (x5) obj3;
                        Intrinsics.checkNotNullParameter(groupId2, "groupId");
                        Intrinsics.checkNotNullParameter(recallable, "recallable");
                        this.f306354b.f306358b.f("PREF_KEY_TRANSACTION_CANCELLABLE" + groupId2, recallable);
                        break;
                    default:
                        String groupId3 = (String) obj2;
                        x5 recallable2 = (x5) obj3;
                        Intrinsics.checkNotNullParameter(groupId3, "groupId");
                        Intrinsics.checkNotNullParameter(recallable2, "recallable");
                        Intrinsics.checkNotNullParameter(recallable2, "<this>");
                        this.f306354b.f306359c.G(new jif.c(recallable2.f273160a), "PREF_KEY_TRANSACTION_CANCELLABLE" + groupId3, wim.z.d(o0.b(jif.c.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: xif.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f306356b;

            {
                this.f306356b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String groupId = (String) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        return (x5) v7.r("PREF_KEY_TRANSACTION_CANCELLABLE", groupId, this.f306356b.f306358b);
                    default:
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        jif.c cVar = (jif.c) this.f306356b.f306359c.T2(j6.a.q("PREF_KEY_TRANSACTION_CANCELLABLE", groupId), i.e);
                        if (cVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        return new x5(cVar.getCancellable());
                }
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: xif.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f306354b;

            {
                this.f306354b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String groupId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(groupId, "groupId");
                        d0<jif.c> d0VarIsTransactionRecallableById = this.f306354b.f306357a.isTransactionRecallableById(groupId);
                        xg6.k kVar = new xg6.k(new c(1), 14);
                        d0VarIsTransactionRecallableById.getClass();
                        ufm.i iVar = new ufm.i(d0VarIsTransactionRecallableById, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String groupId2 = (String) obj2;
                        x5 recallable = (x5) obj3;
                        Intrinsics.checkNotNullParameter(groupId2, "groupId");
                        Intrinsics.checkNotNullParameter(recallable, "recallable");
                        this.f306354b.f306358b.f("PREF_KEY_TRANSACTION_CANCELLABLE" + groupId2, recallable);
                        break;
                    default:
                        String groupId3 = (String) obj2;
                        x5 recallable2 = (x5) obj3;
                        Intrinsics.checkNotNullParameter(groupId3, "groupId");
                        Intrinsics.checkNotNullParameter(recallable2, "recallable");
                        Intrinsics.checkNotNullParameter(recallable2, "<this>");
                        this.f306354b.f306359c.G(new jif.c(recallable2.f273160a), "PREF_KEY_TRANSACTION_CANCELLABLE" + groupId3, wim.z.d(o0.b(jif.c.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}

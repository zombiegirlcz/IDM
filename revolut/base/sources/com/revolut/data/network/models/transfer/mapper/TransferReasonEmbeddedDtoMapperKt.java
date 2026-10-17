package com.revolut.data.network.models.transfer.mapper;

import ibl.d;
import ibl.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import krf.c;
import mrf.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0004\u001a\u00020\u0007*\u00020\u0006H\u0000¢\u0006\u0004\b\u0004\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkrf/c;", "Libl/d;", "toEmbeddedDto", "(Lkrf/c;)Libl/d;", "toDomain", "(Libl/d;)Lkrf/c;", "Libl/c;", "Lmrf/a;", "(Libl/c;)Lmrf/a;", "toDto", "(Lmrf/a;)Libl/c;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class TransferReasonEmbeddedDtoMapperKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.PREDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.CUSTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final c toDomain(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[dVar.getType().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new krf.d(dVar.getDescription());
            }
            throw new NoWhenBranchMatchedException();
        }
        String code = dVar.getCode();
        if (code == null) {
            throw new IllegalArgumentException("Code must exists for predefined reasons");
        }
        String description = dVar.getDescription();
        ibl.c overseasGoodsDetails = dVar.getOverseasGoodsDetails();
        return new krf.e(code, description, overseasGoodsDetails != null ? toDomain(overseasGoodsDetails) : null);
    }

    @NotNull
    public static final ibl.c toDto(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new ibl.c(aVar.f208116a, aVar.f208117b, aVar.f208118c, aVar.d);
    }

    @NotNull
    public static final d toEmbeddedDto(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (!(cVar instanceof krf.e)) {
            if (cVar instanceof krf.d) {
                return new d(e.CUSTOM, null, ((krf.d) cVar).f188860a, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        e eVar = e.PREDEFINED;
        krf.e eVar2 = (krf.e) cVar;
        String str = eVar2.f188861a;
        String str2 = eVar2.f188862b;
        a aVar = eVar2.f188863c;
        return new d(eVar, str, str2, aVar != null ? toDto(aVar) : null);
    }

    @NotNull
    public static final a toDomain(@NotNull ibl.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new a(cVar.getProductName(), cVar.getOriginCountry(), cVar.getShippingFrom(), cVar.getDestinationCountry());
    }
}

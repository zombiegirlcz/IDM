package gi1;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.common.api.R$plurals;
import com.revolut.feature.address.common.api.R$string;
import com.revolut.feature.address.common.api.flow.FieldMode;
import com.revolut.feature.address.common.impl.flow.screen.add.AddAddressScreenContract$InputData;
import com.revolut.feature.address.common.impl.models.AddressConfiguration$FieldConfiguration;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class w implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rh1.b f144055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AddAddressScreenContract$InputData f144056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f144057c;

    public w(rh1.b addressFlowInteractor, yi1.e addressTypeMapper, AddAddressScreenContract$InputData inputData, xi1.a searchScreenItemsProvider) {
        Intrinsics.checkNotNullParameter(addressFlowInteractor, "addressFlowInteractor");
        Intrinsics.checkNotNullParameter(addressTypeMapper, "addressTypeMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(searchScreenItemsProvider, "searchScreenItemsProvider");
        this.f144055a = addressFlowInteractor;
        this.f144056b = inputData;
        this.f144057c = new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.shared_address_flow_address_search_hint, null, null, 14), 126);
    }

    public static Clause a(sh1.l lVar, sh1.g gVar, Clause clause, boolean z) {
        sh1.f fVar = gVar.f263345b;
        if (fVar instanceof sh1.b) {
            return new TextLocalisedClause(R$string.validation_error_required, null, null, 14);
        }
        if (fVar instanceof sh1.d) {
            return new TextLocalisedQuantityClause(R$plurals.validation_error_min_length, Integer.valueOf(((sh1.d) fVar).f263342a), (List) null, (Style) null, 28);
        }
        if (fVar instanceof sh1.c) {
            return new TextLocalisedQuantityClause(R$plurals.validation_error_max_length, Integer.valueOf(((sh1.c) fVar).f263341a), (List) null, (Style) null, 28);
        }
        if (fVar instanceof sh1.a) {
            return ((sh1.a) fVar).f263339a;
        }
        if (clause != null) {
            return clause;
        }
        if (z) {
            return lVar.f263376a.B;
        }
        return null;
    }

    public static boolean b(k kVar) {
        boolean z = kVar.e;
        wi1.a aVar = kVar.i;
        return (z && aVar != wi1.a.UNKNOWN) || aVar == wi1.a.MANUAL || kVar.f144034l;
    }

    public static boolean d(AddressConfiguration$FieldConfiguration addressConfiguration$FieldConfiguration) {
        FieldMode fieldMode = addressConfiguration$FieldConfiguration.f61040a;
        return (fieldMode instanceof FieldMode.Editable) && !((FieldMode.Editable) fieldMode).f60953a;
    }

    public static boolean e(AddressConfiguration$FieldConfiguration addressConfiguration$FieldConfiguration) {
        return !(addressConfiguration$FieldConfiguration.f61040a instanceof FieldMode.Hidden);
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0325 A[PHI: r26 r29
      0x0325: PHI (r26v7 com.revolut.feature.address.common.impl.models.AddressConfiguration$FieldId$AddressLine1) = 
      (r26v6 com.revolut.feature.address.common.impl.models.AddressConfiguration$FieldId$AddressLine1)
      (r26v6 com.revolut.feature.address.common.impl.models.AddressConfiguration$FieldId$AddressLine1)
      (r26v6 com.revolut.feature.address.common.impl.models.AddressConfiguration$FieldId$AddressLine1)
      (r26v6 com.revolut.feature.address.common.impl.models.AddressConfiguration$FieldId$AddressLine1)
      (r26v6 com.revolut.feature.address.common.impl.models.AddressConfiguration$FieldId$AddressLine1)
      (r26v6 com.revolut.feature.address.common.impl.models.AddressConfiguration$FieldId$AddressLine1)
      (r26v6 com.revolut.feature.address.common.impl.models.AddressConfiguration$FieldId$AddressLine1)
      (r26v6 com.revolut.feature.address.common.impl.models.AddressConfiguration$FieldId$AddressLine1)
      (r26v6 com.revolut.feature.address.common.impl.models.AddressConfiguration$FieldId$AddressLine1)
      (r26v6 com.revolut.feature.address.common.impl.models.AddressConfiguration$FieldId$AddressLine1)
      (r26v6 com.revolut.feature.address.common.impl.models.AddressConfiguration$FieldId$AddressLine1)
      (r26v6 com.revolut.feature.address.common.impl.models.AddressConfiguration$FieldId$AddressLine1)
      (r26v6 com.revolut.feature.address.common.impl.models.AddressConfiguration$FieldId$AddressLine1)
      (r26v6 com.revolut.feature.address.common.impl.models.AddressConfiguration$FieldId$AddressLine1)
      (r26v6 com.revolut.feature.address.common.impl.models.AddressConfiguration$FieldId$AddressLine1)
      (r26v6 com.revolut.feature.address.common.impl.models.AddressConfiguration$FieldId$AddressLine1)
      (r26v9 com.revolut.feature.address.common.impl.models.AddressConfiguration$FieldId$AddressLine1)
     binds: [B:158:0x0826, B:160:0x082c, B:151:0x077d, B:153:0x0783, B:144:0x06d6, B:146:0x06dc, B:137:0x062f, B:139:0x0635, B:130:0x0588, B:132:0x058e, B:123:0x04e1, B:125:0x04e7, B:113:0x042c, B:115:0x0432, B:87:0x034e, B:89:0x0354, B:81:0x0321] A[DONT_GENERATE, DONT_INLINE]
      0x0325: PHI (r29v2 java.util.List) = 
      (r29v1 java.util.List)
      (r29v1 java.util.List)
      (r29v1 java.util.List)
      (r29v1 java.util.List)
      (r29v1 java.util.List)
      (r29v1 java.util.List)
      (r29v1 java.util.List)
      (r29v1 java.util.List)
      (r29v1 java.util.List)
      (r29v1 java.util.List)
      (r29v1 java.util.List)
      (r29v1 java.util.List)
      (r29v1 java.util.List)
      (r29v1 java.util.List)
      (r29v1 java.util.List)
      (r29v1 java.util.List)
      (r29v4 java.util.List)
     binds: [B:158:0x0826, B:160:0x082c, B:151:0x077d, B:153:0x0783, B:144:0x06d6, B:146:0x06dc, B:137:0x062f, B:139:0x0635, B:130:0x0588, B:132:0x058e, B:123:0x04e1, B:125:0x04e7, B:113:0x042c, B:115:0x0432, B:87:0x034e, B:89:0x0354, B:81:0x0321] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r126) {
        /*
            Method dump skipped, instruction units count: 3390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gi1.w.c(cli.j):cli.o");
    }
}

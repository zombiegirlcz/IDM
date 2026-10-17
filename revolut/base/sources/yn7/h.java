package yn7;

import cli.n;
import cli.y;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.car_type.MtaCarTypeScreenContract$InputData;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends oki.h implements dli.b {
    public final tl7.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f315270p;

    public h(MtaCarTypeScreenContract$InputData inputData, n mapper, tl7.f bottomDialog) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        this.o = bottomDialog;
        this.f315270p = mra.d.b(this, new e(inputData.f75527a, inputData.f75528b), mapper, null, false, 12);
    }

    public final void I2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (obj2 instanceof d) {
            C2(new f((d) obj2));
        } else if (Intrinsics.f(listId, "CAR_TYPE_HELP_MENU")) {
            tl7.f.R(this.o, R$string.car_insurance_mta_car_type_hint_title, R$string.car_insurance_mta_car_type_hint_text, null, Integer.valueOf(R$string.car_insurance_common_gotIt), null, null, null, null, Constants.TAG_F4);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f315270p;
    }
}

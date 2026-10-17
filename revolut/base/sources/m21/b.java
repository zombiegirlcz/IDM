package m21;

import android.content.SharedPreferences;
import com.revolut.domain.models.topup.TopUpType;
import e31.k;
import ij.e;
import je0.d;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.jetbrains.annotations.NotNull;
import we0.g;

/* JADX INFO: loaded from: classes.dex */
public final class b extends g {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public b() {
        super(2, 3, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        String string = sharedPref.getString("selected", null);
        TopUpType topUpType = Intrinsics.f(sharedPref.getString("IS_GOOGLE_PAY_SELECTED", null), "true") ? TopUpType.GOOGLE_PAY : string != null ? TopUpType.CARD : TopUpType.NONE;
        e eVarEdit = sharedPref.edit();
        eVarEdit.i("selected");
        eVarEdit.i("IS_GOOGLE_PAY_SELECTED");
        eVarEdit.g("TOPUP_TYPE_KEY", u1.g(topUpType, k.a()));
        eVarEdit.commit();
        if (string != null) {
            e eVarEdit2 = sharedPref.edit();
            eVarEdit2.g("TOPUP_CARD_ID_KEY", string);
            eVarEdit2.commit();
        }
    }
}

package rid;

import android.content.SharedPreferences;
import ij.e;
import kotlin.jvm.internal.Intrinsics;
import we0.g;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d extends g {
    public final int d;
    public final int e;

    public d(int i, int i2) {
        super(i, i2, 1);
        this.d = i;
        this.e = i2;
    }

    @Override // we0.g
    public final int a() {
        return this.e;
    }

    @Override // we0.g
    public final int b() {
        return this.d;
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, je0.d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        e eVarA = sharedPref.edit();
        eVarA.a();
        eVarA.commit();
    }
}

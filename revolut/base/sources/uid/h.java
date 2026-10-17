package uid;

import android.widget.EditText;
import au0.a2;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import java.text.NumberFormat;
import kotlin.jvm.internal.Intrinsics;
import ud3.n;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements yz0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f280384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f280385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f280386c;
    public final NumberFormat d;
    public String e;
    public final a2 f;

    public h(MaskedTextInputEditText field, n onValueChanged) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(onValueChanged, "onValueChanged");
        this.f280384a = field;
        this.f280385b = onValueChanged;
        this.d = NumberFormat.getIntegerInstance();
        this.e = "";
        a2 a2Var = new a2(this, 12);
        this.f = a2Var;
        field.addTextChangedListener(a2Var);
    }

    @Override // yz0.b
    public final void a() {
        this.f280384a.removeTextChangedListener(this.f);
    }

    @Override // yz0.b
    public final /* bridge */ /* synthetic */ Clause c() {
        return null;
    }

    @Override // yz0.b
    public final boolean d() {
        return false;
    }

    @Override // yz0.b
    public final String e() {
        return this.e;
    }

    @Override // yz0.b
    public final int f() {
        return this.f280384a.getSelectionEnd();
    }

    @Override // yz0.b
    public final void onSelectionChanged(int i) {
    }
}

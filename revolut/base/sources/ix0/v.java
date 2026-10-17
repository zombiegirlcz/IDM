package ix0;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class v implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f169318b;

    public /* synthetic */ v(l lVar, int i) {
        this.f169317a = i;
        this.f169318b = lVar;
    }

    private final void a(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void b(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void c(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void d(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s2) {
        switch (this.f169317a) {
            case 0:
                Intrinsics.checkNotNullParameter(s2, "s");
                this.f169318b.invoke(s2.toString());
                break;
            default:
                Intrinsics.checkNotNullParameter(s2, "s");
                this.f169318b.invoke(s2.toString());
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i5 = this.f169317a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i5 = this.f169317a;
    }
}

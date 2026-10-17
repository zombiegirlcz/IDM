package rx0;

import android.text.InputFilter;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements InputFilter {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f258003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f258004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f258005c;
    public final Lazy d;

    public i(int i, final Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.f258003a = i;
        final int i2 = 0;
        this.f258004b = yhm.j.b(new Function0() { // from class: rx0.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return Character.valueOf(oc.c.k(locale));
                    case 1:
                        return Character.valueOf(oc.c.l(locale));
                    default:
                        Locale locale2 = locale;
                        Intrinsics.checkNotNullParameter(locale2, "locale");
                        return Integer.valueOf(oc.c.i(locale2).getGroupingSize());
                }
            }
        });
        final int i3 = 1;
        this.f258005c = yhm.j.b(new Function0() { // from class: rx0.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return Character.valueOf(oc.c.k(locale));
                    case 1:
                        return Character.valueOf(oc.c.l(locale));
                    default:
                        Locale locale2 = locale;
                        Intrinsics.checkNotNullParameter(locale2, "locale");
                        return Integer.valueOf(oc.c.i(locale2).getGroupingSize());
                }
            }
        });
        final int i5 = 2;
        this.d = yhm.j.b(new Function0() { // from class: rx0.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return Character.valueOf(oc.c.k(locale));
                    case 1:
                        return Character.valueOf(oc.c.l(locale));
                    default:
                        Locale locale2 = locale;
                        Intrinsics.checkNotNullParameter(locale2, "locale");
                        return Integer.valueOf(oc.c.i(locale2).getGroupingSize());
                }
            }
        });
    }

    public final char a() {
        return ((Character) this.f258004b.getValue()).charValue();
    }

    public final char b() {
        return ((Character) this.f258005c.getValue()).charValue();
    }

    public final int c() {
        return ((Number) this.d.getValue()).intValue();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!i.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.views.input.InputText.DefaultAmountInputFilter");
        i iVar = (i) obj2;
        return this.f258003a == iVar.f258003a && a() == iVar.a() && b() == iVar.b() && c() == iVar.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.text.Spanned] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9 */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence filter(java.lang.CharSequence r8, int r9, int r10, android.text.Spanned r11, int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rx0.i.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }

    public final int hashCode() {
        return Integer.hashCode(c()) + ((Character.hashCode(b()) + ((Character.hashCode(a()) + (Integer.hashCode(this.f258003a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DefaultAmountInputFilter()";
    }
}

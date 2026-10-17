package v6i;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f286394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f286395c;
    public final xi0.b d;
    public final xi0.b e;
    public final Data f;

    public f(String formattedInput, k type, g mode, xi0.b baseCurrency, xi0.b counterCurrency, Data settings) {
        Intrinsics.checkNotNullParameter(formattedInput, "formattedInput");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(counterCurrency, "counterCurrency");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f286393a = formattedInput;
        this.f286394b = type;
        this.f286395c = mode;
        this.d = baseCurrency;
        this.e = counterCurrency;
        this.f = settings;
    }

    public static f a(f fVar, String str, Data data, int i) {
        if ((i & 1) != 0) {
            str = fVar.f286393a;
        }
        String formattedInput = str;
        k type = fVar.f286394b;
        g mode = fVar.f286395c;
        xi0.b baseCurrency = fVar.d;
        xi0.b counterCurrency = fVar.e;
        if ((i & 32) != 0) {
            data = fVar.f;
        }
        Data settings = data;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(formattedInput, "formattedInput");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(counterCurrency, "counterCurrency");
        Intrinsics.checkNotNullParameter(settings, "settings");
        return new f(formattedInput, type, mode, baseCurrency, counterCurrency, settings);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f286393a, fVar.f286393a) && this.f286394b == fVar.f286394b && this.f286395c == fVar.f286395c && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + h30.l.j(this.e, h30.l.j(this.d, (this.f286395c.hashCode() + ((this.f286394b.hashCode() + (this.f286393a.hashCode() * 31)) * 31)) * 31, 31), 31);
    }
}

package zbj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class u implements z {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f320941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f320942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f320943c;

    public u(xi0.b currency, boolean z, Data contactsData) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(contactsData, "contactsData");
        this.f320941a = currency;
        this.f320942b = z;
        this.f320943c = contactsData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f320941a, uVar.f320941a) && this.f320942b == uVar.f320942b && Intrinsics.f(this.f320943c, uVar.f320943c);
    }

    public final int hashCode() {
        return this.f320943c.hashCode() + j6.a.c(this.f320941a.hashCode() * 31, 31, this.f320942b);
    }
}

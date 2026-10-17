package rb6;

import ba6.u;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f252961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f252962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f252963c;
    public final dj0.d d;

    public f(u donationMode, Data charity, Data amountSuggestions, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(donationMode, "donationMode");
        Intrinsics.checkNotNullParameter(charity, "charity");
        Intrinsics.checkNotNullParameter(amountSuggestions, "amountSuggestions");
        this.f252961a = donationMode;
        this.f252962b = charity;
        this.f252963c = amountSuggestions;
        this.d = dVar;
    }

    public static f a(f fVar, Data charity, Data amountSuggestions, dj0.d dVar, int i) {
        u donationMode = fVar.f252961a;
        if ((i & 2) != 0) {
            charity = fVar.f252962b;
        }
        if ((i & 4) != 0) {
            amountSuggestions = fVar.f252963c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(donationMode, "donationMode");
        Intrinsics.checkNotNullParameter(charity, "charity");
        Intrinsics.checkNotNullParameter(amountSuggestions, "amountSuggestions");
        return new f(donationMode, charity, amountSuggestions, dVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f252961a == fVar.f252961a && Intrinsics.f(this.f252962b, fVar.f252962b) && Intrinsics.f(this.f252963c, fVar.f252963c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f252963c, kii.e.c(this.f252962b, this.f252961a.hashCode() * 31, 31), 31);
        dj0.d dVar = this.d;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }
}

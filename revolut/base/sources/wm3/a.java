package wm3;

import com.revolut.feature.contacts.api.navigation.AddContactInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f298598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f298599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f298600c;
    public final AddContactInputData.InputMode d;
    public final el3.b e;

    public a(String name, String phoneOrEmail, boolean z, AddContactInputData.InputMode inputMode, el3.b finishMode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(phoneOrEmail, "phoneOrEmail");
        Intrinsics.checkNotNullParameter(inputMode, "inputMode");
        Intrinsics.checkNotNullParameter(finishMode, "finishMode");
        this.f298598a = name;
        this.f298599b = phoneOrEmail;
        this.f298600c = z;
        this.d = inputMode;
        this.e = finishMode;
    }

    public static a a(a aVar, String str, String str2, boolean z, int i) {
        if ((i & 1) != 0) {
            str = aVar.f298598a;
        }
        String name = str;
        if ((i & 2) != 0) {
            str2 = aVar.f298599b;
        }
        String phoneOrEmail = str2;
        if ((i & 4) != 0) {
            z = aVar.f298600c;
        }
        AddContactInputData.InputMode inputMode = aVar.d;
        el3.b finishMode = aVar.e;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(phoneOrEmail, "phoneOrEmail");
        Intrinsics.checkNotNullParameter(inputMode, "inputMode");
        Intrinsics.checkNotNullParameter(finishMode, "finishMode");
        return new a(name, phoneOrEmail, z, inputMode, finishMode);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f298598a, aVar.f298598a) && Intrinsics.f(this.f298599b, aVar.f298599b) && this.f298600c == aVar.f298600c && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + j6.a.c(p.a.c(this.f298598a.hashCode() * 31, 31, this.f298599b), 31, this.f298600c)) * 31);
    }
}

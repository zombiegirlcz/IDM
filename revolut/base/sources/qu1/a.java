package qu1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f249175b;

    public a(String str, String userPhoneNumber) {
        Intrinsics.checkNotNullParameter(userPhoneNumber, "userPhoneNumber");
        this.f249174a = str;
        this.f249175b = userPhoneNumber;
    }

    public static a a(a aVar, String str) {
        String userPhoneNumber = aVar.f249175b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(userPhoneNumber, "userPhoneNumber");
        return new a(str, userPhoneNumber);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f249174a, aVar.f249174a) && Intrinsics.f(this.f249175b, aVar.f249175b);
    }

    public final int hashCode() {
        String str = this.f249174a;
        return this.f249175b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}

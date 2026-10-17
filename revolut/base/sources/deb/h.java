package deb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f113352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f113353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f113354c;
    public final Data d;
    public final String e;

    public h(Data firstName, Data lastName, j phone, Data email, String note) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(note, "note");
        this.f113352a = firstName;
        this.f113353b = lastName;
        this.f113354c = phone;
        this.d = email;
        this.e = note;
    }

    public static h a(h hVar, Data data, Data data2, j jVar, Data data3, String str, int i) {
        if ((i & 1) != 0) {
            data = hVar.f113352a;
        }
        Data firstName = data;
        if ((i & 2) != 0) {
            data2 = hVar.f113353b;
        }
        Data lastName = data2;
        if ((i & 4) != 0) {
            jVar = hVar.f113354c;
        }
        j phone = jVar;
        if ((i & 8) != 0) {
            data3 = hVar.d;
        }
        Data email = data3;
        if ((i & 16) != 0) {
            str = hVar.e;
        }
        String note = str;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(note, "note");
        return new h(firstName, lastName, phone, email, note);
    }

    public static boolean e(Data data) {
        String str;
        return data.getError() == null && (str = (String) data.getContent()) != null && (d0.W(str) ^ true);
    }

    public final boolean c() {
        return e(this.f113352a) && e(this.f113353b) && e(this.f113354c.f113357a) && e(this.d);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f113352a, hVar.f113352a) && Intrinsics.f(this.f113353b, hVar.f113353b) && Intrinsics.f(this.f113354c, hVar.f113354c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kii.e.c(this.d, (this.f113354c.hashCode() + kii.e.c(this.f113353b, this.f113352a.hashCode() * 31, 31)) * 31, 31);
    }
}

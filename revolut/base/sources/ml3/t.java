package ml3;

import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import com.revolut.feature.contacts.impl.data.database.ContactsDatabase;
import efm.d0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public final class t extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f206622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ao.g f206623b = new ao.g(20);

    public t(ContactsDatabase contactsDatabase) {
        this.f206622a = contactsDatabase;
    }

    @Override // ml3.s
    public final efm.b a(String str) {
        return RxRoom.createCompletable(this.f206622a, false, true, new lu6.p(str, 28));
    }

    @Override // ml3.s
    public final efm.b b(ArrayList arrayList) {
        return RxRoom.createCompletable(this.f206622a, false, true, new a54.c(7, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList, p.a.s("DELETE FROM remote_contacts_extra WHERE username IN ("), ")"), arrayList));
    }

    @Override // ml3.s
    public final efm.k c(String str) {
        return RxRoom.createMaybe(this.f206622a, true, false, new lu6.p(str, 27));
    }

    @Override // ml3.s
    public final d0 d() {
        return RxRoom.createSingle(this.f206622a, true, false, new mk3.c(22));
    }

    @Override // ml3.s
    public final efm.b e(ArrayList arrayList) {
        return RxRoom.createCompletable(this.f206622a, false, true, new mk5.s(this, arrayList, 4));
    }

    @Override // ml3.s
    public final efm.r f() {
        mk3.c cVar = new mk3.c(23);
        return RxRoom.createObservable(this.f206622a, false, new String[]{"remote_contacts_extra"}, cVar);
    }

    @Override // ml3.s
    public final efm.r g() {
        mk3.c cVar = new mk3.c(21);
        return RxRoom.createObservable(this.f206622a, false, new String[]{"remote_contacts_extra"}, cVar);
    }
}

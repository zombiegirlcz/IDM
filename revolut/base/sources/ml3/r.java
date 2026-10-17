package ml3;

import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import com.revolut.feature.contacts.impl.data.database.ContactsDatabase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class r extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f206620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ao.g f206621b = new ao.g(19);

    public r(ContactsDatabase contactsDatabase) {
        this.f206620a = contactsDatabase;
    }

    @Override // ml3.q
    public final efm.b a(String str) {
        return RxRoom.createCompletable(this.f206620a, false, true, new lu6.p(str, 26));
    }

    @Override // ml3.q
    public final efm.b b(ArrayList arrayList) {
        return RxRoom.createCompletable(this.f206620a, false, true, new a54.c(6, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList, p.a.s("DELETE FROM remote_contacts WHERE username IN ("), ")"), arrayList));
    }

    @Override // ml3.q
    public final efm.k c(String str) {
        return RxRoom.createMaybe(this.f206620a, true, false, new lu6.p(str, 25));
    }

    @Override // ml3.q
    public final efm.b d(o oVar) {
        return RxRoom.createCompletable(this.f206620a, false, true, new mk5.s(this, oVar, 3));
    }

    @Override // ml3.q
    public final efm.r e() {
        mk3.c cVar = new mk3.c(19);
        return RxRoom.createObservable(this.f206620a, false, new String[]{"remote_contacts"}, cVar);
    }

    @Override // ml3.q
    public final efm.r f() {
        mk3.c cVar = new mk3.c(20);
        return RxRoom.createObservable(this.f206620a, false, new String[]{"remote_contacts"}, cVar);
    }

    @Override // ml3.q
    public final efm.r g() {
        mk3.c cVar = new mk3.c(18);
        return RxRoom.createObservable(this.f206620a, false, new String[]{"remote_contacts"}, cVar);
    }

    @Override // ml3.q
    public final efm.r h(List list) {
        amh.n nVar = new amh.n(prk.o.p(")", list, p.a.s("SELECT * FROM remote_contacts WHERE code IN (")), list, 8);
        return RxRoom.createObservable(this.f206620a, false, new String[]{"remote_contacts"}, nVar);
    }
}

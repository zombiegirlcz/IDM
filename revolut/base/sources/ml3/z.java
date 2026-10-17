package ml3;

import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import com.revolut.feature.contacts.impl.data.database.ContactsDatabase;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public final class z extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f206629a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f206631c = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ao.g f206630b = new ao.g(this, 21);

    public z(ContactsDatabase contactsDatabase) {
        this.f206629a = contactsDatabase;
    }

    @Override // ml3.x
    public final efm.b a(String str) {
        return RxRoom.createCompletable(this.f206629a, false, true, new lu6.p(str, 29));
    }

    @Override // ml3.x
    public final efm.b b(ArrayList arrayList) {
        return RxRoom.createCompletable(this.f206629a, false, true, new a54.c(8, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList, p.a.s("DELETE FROM virtual_contacts WHERE point in ("), ")"), arrayList));
    }

    @Override // ml3.x
    public final efm.b c(u uVar) {
        return RxRoom.createCompletable(this.f206629a, false, true, new mk5.s(this, uVar, 5));
    }

    @Override // ml3.x
    public final efm.r d() {
        y yVar = new y(this, 0);
        return RxRoom.createObservable(this.f206629a, false, new String[]{"virtual_contacts"}, yVar);
    }
}

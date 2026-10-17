package nn3;

import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public abstract class h {
    public static final boolean a(c cVar) {
        Integer num;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        ContactsChooserMode contactsChooserMode = cVar.e;
        if (contactsChooserMode instanceof ContactsChooserMode.MultiSelect) {
            num = ((ContactsChooserMode.MultiSelect) contactsChooserMode).f66077a;
        } else {
            if (!(contactsChooserMode instanceof ContactsChooserMode.SingleSelect)) {
                throw new NoWhenBranchMatchedException();
            }
            num = null;
        }
        if (num != null) {
            if (cVar.f217439b.size() >= num.intValue()) {
                return true;
            }
        }
        return false;
    }
}

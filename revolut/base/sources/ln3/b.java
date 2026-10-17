package ln3;

import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserInputData;
import com.revolut.feature.contacts_chooser.impl.ui.ContactsChooserScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {
    public static ContactsChooserScreen a(ContactsChooserInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return new ContactsChooserScreen(inputData);
    }

    public static ContactsChooserScreen b(ContactsChooserInputData inputData, bn3.a contextHandler) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(contextHandler, "contextHandler");
        return new ContactsChooserScreen(inputData, contextHandler);
    }
}

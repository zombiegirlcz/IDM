package ul3;

import android.content.Context;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.contacts.api.navigation.AddContactFeatureConfig;
import com.revolut.feature.contacts.api.navigation.AddContactInputData;
import com.revolut.feature.contacts.api.navigation.ContactsFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof ContactsFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        AddContactInputData.InputMode full;
        el3.b bVar;
        ContactsFeatureConfig config = (ContactsFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (!(config instanceof ContactsFeatureConfig.AddContact)) {
            throw new NoWhenBranchMatchedException();
        }
        ContactsFeatureConfig.AddContact addContact = (ContactsFeatureConfig.AddContact) config;
        String f65989b = addContact.getF65989b();
        AddContactInputData.Prefill.PhoneOrNone phone = f65989b != null ? new AddContactInputData.Prefill.Phone(f65989b) : AddContactInputData.Prefill.None.f65978a;
        if (addContact instanceof ContactsFeatureConfig.AddContact.ByPhone) {
            full = new AddContactInputData.InputMode.Phone(phone);
        } else {
            if (!(addContact instanceof ContactsFeatureConfig.AddContact.ByPhoneOrEmail)) {
                throw new NoWhenBranchMatchedException();
            }
            full = new AddContactInputData.InputMode.Full(phone);
        }
        int i = b.f280865a[addContact.getF65988a().ordinal()];
        if (i == 1) {
            bVar = el3.b.FINISH;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = el3.b.CHAT;
        }
        navigator.c(new FeatureCommand(new AddContactFeatureConfig(new AddContactInputData(full, bVar, R$drawable.uikit_icn_24_back_button_arrow))));
    }
}

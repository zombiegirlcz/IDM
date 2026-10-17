package te9;

import aii.u;
import com.revolut.feature.passcode_reminder.api.navigation.PasscodeReminderDestination;
import com.revolut.feature.passcode_reminder.impl.ui.flow.PasscodeReminderFlow;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof PasscodeReminderDestination) {
            return new PasscodeReminderFlow();
        }
        return null;
    }
}

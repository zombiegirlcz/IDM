package fxj;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.retail.feature.api.userauth.screen.notifications.NotificationsPermissionDestination;
import com.revolut.retail.feature.impl.userauth.screen.notifications.NotificationsPermissionScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements ohi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f138833a = 0;

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof p0j.b) {
            return ((p0j.b) descriptor).a(new NotificationsPermissionScreen());
        }
        super.c(descriptor);
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof NotificationsPermissionDestination)) {
            return null;
        }
        NotificationsPermissionScreen notificationsPermissionScreen = new NotificationsPermissionScreen();
        b block = new b(flowModel, 0);
        Intrinsics.checkNotNullParameter(block, "block");
        notificationsPermissionScreen.H = block;
        return notificationsPermissionScreen;
    }
}

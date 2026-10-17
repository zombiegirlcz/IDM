package uli;

import android.net.Uri;
import com.revolut.retail.core.navigation.DeeplinkNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.ui.login.pin.LoginScreenContract$Configuration;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;
import lwl.n;
import lwl.o;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes10.dex */
public final class g {
    public static DeeplinkNavigateCommand a(String str) {
        o.Companion.getClass();
        ExplicitActivityDestination explicitActivityDestinationA = n.a();
        LoginScreenContract$Configuration loginScreenContract$Configuration = new LoginScreenContract$Configuration(sab.b.NONE, null, str, null, LDSFile.EF_DG4_TAG);
        Uri EMPTY = Uri.EMPTY;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        return new DeeplinkNavigateCommand(explicitActivityDestinationA, loginScreenContract$Configuration, null, EMPTY, Constants.EMVTag.TAG_9C_TRANSACTION_TYPE);
    }
}

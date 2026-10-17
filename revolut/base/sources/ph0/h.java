package ph0;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.ApiException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f236196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f236197b;

    public h(Context context, String googleSignInServerClientId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(googleSignInServerClientId, "googleSignInServerClientId");
        this.f236196a = context;
        this.f236197b = googleSignInServerClientId;
    }

    public final i a(Intent intent) throws Throwable {
        GoogleSignInAccount result = GoogleSignIn.getSignedInAccountFromIntent(intent).getResult(ApiException.class);
        String email = result.getEmail();
        String serverAuthCode = result.getServerAuthCode();
        if (email == null) {
            String name = g.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, name, "email is null", null, h0Var);
            return null;
        }
        if (serverAuthCode != null) {
            return new i(email, serverAuthCode);
        }
        String name2 = g.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        h0 h0Var2 = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, name2, "serverAuthCode is null", null, h0Var2);
        return null;
    }
}

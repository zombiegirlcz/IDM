package wx8;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f300785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z70.a f300786b;

    public a(b relay, z70.a contextProvider) {
        Intrinsics.checkNotNullParameter(relay, "relay");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        this.f300785a = relay;
        this.f300786b = contextProvider;
    }

    public final boolean a(String url2) {
        Intrinsics.checkNotNullParameter(url2, "uri");
        b bVar = this.f300785a;
        if (!bVar.f300787a) {
            return false;
        }
        Intrinsics.checkNotNullParameter(url2, "url");
        bVar.f300788b.k(url2);
        z70.a aVar = this.f300786b;
        Intent launchIntentForPackage = aVar.getContext().getPackageManager().getLaunchIntentForPackage(aVar.getContext().getPackageName());
        if (launchIntentForPackage == null) {
            return false;
        }
        try {
            aVar.getContext().startActivity(launchIntentForPackage);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }
}

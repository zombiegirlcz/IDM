package a3a;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public static Intent a() {
        return new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("revolut").authority("app").appendPath("payments").build());
    }
}

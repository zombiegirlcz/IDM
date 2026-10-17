package gd;

import ad.g;
import android.content.Context;
import android.preference.PreferenceManager;
import b9k.f;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f143014b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f143015a;

    public a(f fVar) {
        Context context = (Context) fVar.f13817b;
        String str = (String) fVar.f13816a;
        String str2 = (String) fVar.f13818c;
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            applicationContext.getSharedPreferences(str2, 0).edit();
        }
        this.f143015a = (g) fVar.f13819g;
    }
}

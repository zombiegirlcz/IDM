package x8g;

import android.content.ContentResolver;
import android.net.Uri;
import f01.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements n8g.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f303320a;

    static {
        Uri.parse("content://com.android.calendar/calendars");
    }

    public b(ContentResolver contentResolver, c uiKitResources) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f303320a = uiKitResources;
    }
}

package b90;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import ipa.e;
import ipa.l;
import ipa.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContextThemeWrapper f13532a;

    public i(ContextThemeWrapper context, s70.a intentProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        this.f13532a = context;
    }

    public static int a(l lVar) {
        int i = h.f13530a[lVar.ordinal()];
        if (i == 1) {
            return -1;
        }
        if (i == 2) {
            return 0;
        }
        if (i == 3) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static PendingIntent b(ipa.e eVar) {
        if (eVar instanceof ipa.f) {
            return (PendingIntent) ((ipa.f) eVar).a();
        }
        if (eVar instanceof e.a) {
            return null;
        }
        throw new IllegalStateException("Wrong push destination intent");
    }

    public static Person c(n nVar) {
        Person.Builder builder = new Person.Builder();
        builder.setName(nVar.b());
        builder.setKey(nVar.c());
        Bitmap bitmapA = nVar.a();
        if (bitmapA != null) {
            builder.setIcon(IconCompat.createWithBitmap(bitmapA));
        }
        Person personBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(personBuild, "build(...)");
        return personBuild;
    }
}

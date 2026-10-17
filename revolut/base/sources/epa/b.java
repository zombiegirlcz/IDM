package epa;

import android.content.Context;
import com.revolut.feature.profile_avatar.impl.R$dimen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b f128129a = new b();

    private b() {
    }

    public static int a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getDimensionPixelSize(R$dimen.profile_avatar_max_size);
    }
}

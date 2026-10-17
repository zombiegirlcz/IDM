package d1j;

import android.content.Context;
import ihm.b;
import kotlin.jvm.internal.Intrinsics;
import od0.e;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f110651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xe0.e f110652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f110653c;

    public a(Context context, xe0.e secureStorage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(secureStorage, "secureStorage");
        this.f110651a = context;
        this.f110652b = secureStorage;
        this.f110653c = j6.a.h("create(...)");
    }

    @Override // od0.e
    public final void clear() {
        this.f110652b.clear();
    }
}

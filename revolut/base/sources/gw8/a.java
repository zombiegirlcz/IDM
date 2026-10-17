package gw8;

import android.app.Activity;
import ebg.o;
import eim.c;
import fim.h;
import kotlin.jvm.internal.Intrinsics;
import pd7.n;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f147281a = new a();

    private a() {
    }

    @Override // pd7.n
    public final Object a(Activity activity, String str, o frame) {
        Object objB = new c(h.b(frame)).b();
        if (objB == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objB;
    }
}

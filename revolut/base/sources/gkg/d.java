package gkg;

import android.content.Context;
import androidx.core.content.res.ResourcesCompat;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f144399b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f144400a;

    public d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f144400a = context;
    }

    public static void b() {
        try {
            Field declaredField = ResourcesCompat.class.getDeclaredField("sColorStateCaches");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(null);
            WeakHashMap weakHashMap = obj2 instanceof WeakHashMap ? (WeakHashMap) obj2 : null;
            if (weakHashMap != null) {
                weakHashMap.clear();
                Unit unit = Unit.f186387a;
            }
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r18, xjg.m r19, xjg.j r20) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gkg.d.a(com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration, xjg.m, xjg.j):void");
    }
}

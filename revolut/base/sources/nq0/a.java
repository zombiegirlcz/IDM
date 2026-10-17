package nq0;

import android.app.Activity;
import android.content.Context;
import com.revolut.core.ui_kit.R$id;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ox0.w;
import yp0.c0;
import yp0.d0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements w {

    @NotNull
    public static final C1216a Companion = new C1216a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f218340a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f218341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f218342c;
    public boolean d;
    public long e;
    public long f;

    /* JADX INFO: renamed from: nq0.a$a, reason: collision with other inner class name */
    public static final class C1216a {
        private C1216a() {
        }

        public static a a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Activity activityM = kli.a.m(context);
            if (activityM == null) {
                return new a();
            }
            int i = R$id.internal_loading_button_registry_tag;
            d0 d0Var = d0.f315718a;
            c0 c0VarA = d0.a(activityM);
            Object objA = c0VarA.a(i);
            if (objA == null) {
                objA = new a();
                c0VarA.b(i, objA);
            }
            return (a) objA;
        }
    }

    public final b a() {
        LinkedHashMap linkedHashMap = this.f218340a;
        b bVar = null;
        if (!linkedHashMap.isEmpty() && this.d) {
            Collection<b> collectionValues = linkedHashMap.values();
            boolean z = this.f218341b > 0;
            for (b bVar2 : collectionValues) {
                long jB = bVar2.b();
                if (jB != 0) {
                    if (!z) {
                        long j2 = this.e;
                        if (jB > this.f || j2 > jB) {
                            if (bVar != null) {
                            }
                            bVar = bVar2;
                        }
                    } else if (jB > this.e) {
                        if (bVar != null || bVar.b() <= jB) {
                            bVar = bVar2;
                        }
                    }
                }
            }
        }
        return bVar;
    }
}

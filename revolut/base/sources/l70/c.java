package l70;

import d9.e1;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    @NotNull
    public static final a Companion = new a(0);

    public static final class a extends ee.b {
        public /* synthetic */ a(int i) {
            this();
        }

        @Override // ee.b
        public final void a() {
            Object objC = c();
            Intrinsics.i(objC, "null cannot be cast to non-null type com.revolut.core.android.di.CoreAndroidComponent");
            e0.k((CoroutineScope) ((e) objC).g0.get(), e1.a("Component cleanup", null));
        }

        @Override // ee.b
        public final void f() {
            Object objC = c();
            Intrinsics.i(objC, "null cannot be cast to non-null type com.revolut.core.android.di.CoreAndroidComponent");
            v70.c migratorFactory = (v70.c) ((e) objC).f192432a0.get();
            Intrinsics.checkNotNullParameter(migratorFactory, "migratorFactory");
            try {
                migratorFactory.getClass();
                Intrinsics.checkNotNullParameter("CoreAndroidApi", "name");
                ufm.g.a(new ufm.g(migratorFactory.f286525a));
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            }
        }

        private a() {
            super(new jli.f(7));
        }
    }
}

package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import ce.c;
import ce.n;
import ce.t;
import com.google.firebase.components.ComponentRegistrar;
import df.e;
import eg.q;
import eg.u;
import eg.v;
import eg.y;
import eg.z;
import hd.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import pd.g;
import vd.a;
import vd.b;
import wb.i;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lce/b;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "eg/z", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @NotNull
    private static final t appContext;

    @NotNull
    private static final t backgroundDispatcher;

    @NotNull
    private static final t blockingDispatcher;

    @NotNull
    private static final t firebaseApp;

    @NotNull
    private static final t firebaseInstallationsApi;

    @NotNull
    private static final t firebaseSessionsComponent;

    @NotNull
    private static final t transportFactory;

    @Deprecated
    @NotNull
    public static final String LIBRARY_NAME = "fire-sessions";

    @Deprecated
    @NotNull
    public static final String TAG = "FirebaseSessions";

    @NotNull
    private static final z Companion = new z();

    static {
        t tVarA = t.a(Context.class);
        Intrinsics.checkNotNullExpressionValue(tVarA, "unqualified(Context::class.java)");
        appContext = tVarA;
        t tVarA2 = t.a(g.class);
        Intrinsics.checkNotNullExpressionValue(tVarA2, "unqualified(FirebaseApp::class.java)");
        firebaseApp = tVarA2;
        t tVarA3 = t.a(e.class);
        Intrinsics.checkNotNullExpressionValue(tVarA3, "unqualified(FirebaseInstallationsApi::class.java)");
        firebaseInstallationsApi = tVarA3;
        t tVar = new t(a.class, CoroutineDispatcher.class);
        Intrinsics.checkNotNullExpressionValue(tVar, "qualified(Background::cl…neDispatcher::class.java)");
        backgroundDispatcher = tVar;
        t tVar2 = new t(b.class, CoroutineDispatcher.class);
        Intrinsics.checkNotNullExpressionValue(tVar2, "qualified(Blocking::clas…neDispatcher::class.java)");
        blockingDispatcher = tVar2;
        t tVarA4 = t.a(i.class);
        Intrinsics.checkNotNullExpressionValue(tVarA4, "unqualified(TransportFactory::class.java)");
        transportFactory = tVarA4;
        t tVarA5 = t.a(u.class);
        Intrinsics.checkNotNullExpressionValue(tVarA5, "unqualified(FirebaseSessionsComponent::class.java)");
        firebaseSessionsComponent = tVarA5;
        try {
            int i = y.f;
        } catch (NoClassDefFoundError unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q getComponents$lambda$0(c cVar) {
        return ((eg.i) ((u) cVar.d(firebaseSessionsComponent))).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u getComponents$lambda$1(c cVar) {
        r rVarA = v.a();
        Object objD = cVar.d(appContext);
        Intrinsics.checkNotNullExpressionValue(objD, "container[appContext]");
        rVarA.m((Context) objD);
        Object objD2 = cVar.d(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(objD2, "container[backgroundDispatcher]");
        rVarA.n((CoroutineContext) objD2);
        Object objD3 = cVar.d(blockingDispatcher);
        Intrinsics.checkNotNullExpressionValue(objD3, "container[blockingDispatcher]");
        rVarA.o((CoroutineContext) objD3);
        Object objD4 = cVar.d(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(objD4, "container[firebaseApp]");
        rVarA.t((g) objD4);
        Object objD5 = cVar.d(firebaseInstallationsApi);
        Intrinsics.checkNotNullExpressionValue(objD5, "container[firebaseInstallationsApi]");
        rVarA.u((e) objD5);
        cf.b bVarE = cVar.e(transportFactory);
        Intrinsics.checkNotNullExpressionValue(bVarE, "container.getProvider(transportFactory)");
        rVarA.E(bVarE);
        return rVarA.p();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<ce.b> getComponents() {
        ce.a aVarB = ce.b.b(q.class);
        aVarB.f23279a = "fire-sessions";
        aVarB.a(n.b(firebaseSessionsComponent));
        aVarB.f = new a5.a(14);
        aVarB.c(2);
        ce.b bVarB = aVarB.b();
        ce.a aVarB2 = ce.b.b(u.class);
        aVarB2.f23279a = "fire-sessions-component";
        aVarB2.a(n.b(appContext));
        aVarB2.a(n.b(backgroundDispatcher));
        aVarB2.a(n.b(blockingDispatcher));
        aVarB2.a(n.b(firebaseApp));
        aVarB2.a(n.b(firebaseInstallationsApi));
        aVarB2.a(new n(transportFactory, 1, 1));
        aVarB2.f = new a5.a(15);
        return zhm.v.k(bVarB, aVarB2.b(), mo3.a.d("fire-sessions", "2.1.2"));
    }
}

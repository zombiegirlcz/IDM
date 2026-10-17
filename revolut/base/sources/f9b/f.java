package f9b;

import com.google.firebase.messaging.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yf.c f132902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f132903b;

    public f(yf.c connectionWidgetDisplayer, i retailServerErrorHandlerInteractor) {
        Intrinsics.checkNotNullParameter(connectionWidgetDisplayer, "connectionWidgetDisplayer");
        Intrinsics.checkNotNullParameter(retailServerErrorHandlerInteractor, "retailServerErrorHandlerInteractor");
        this.f132902a = connectionWidgetDisplayer;
        this.f132903b = retailServerErrorHandlerInteractor;
    }

    public static j a(f fVar) {
        fVar.getClass();
        return new j(fVar, null, false);
    }

    public static b b(f fVar) {
        fVar.getClass();
        boolean z = false;
        return new b(fVar, (Function1) null, z, z);
    }
}

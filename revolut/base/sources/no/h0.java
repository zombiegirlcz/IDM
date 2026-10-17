package no;

import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.ui.draw.CacheDrawScope;
import com.google.protobuf.f3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class h0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f217779a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f217780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f217781c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h0(long j2, eo.f fVar, boolean z) {
        this.f217781c = z;
        this.d = fVar;
        this.f217780b = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f217779a) {
            case 0:
                eo.f fVar = (eo.f) this.d;
                f3 buildStruct = (f3) obj2;
                Intrinsics.checkNotNullParameter(buildStruct, "$this$buildStruct");
                boolean z = this.f217781c;
                com.bumptech.glide.c.t(buildStruct, "completed", Boolean.valueOf(z));
                com.bumptech.glide.c.x(buildStruct, "type", fVar.a());
                if (z) {
                    com.bumptech.glide.c.u(buildStruct, "completion_time", Double.valueOf(this.f217780b));
                }
                return Unit.f186387a;
            case 1:
                return nya.k.a((nya.k) obj2, new nya.l((pwa.m) this.d, new lya.d(new lya.a(this.f217780b)), this.f217781c), null, false, false, false, 30);
            default:
                return AndroidSelectionHandles_androidKt.drawSelectionHandle$lambda$0$0$0(this.f217780b, (Function0) this.d, this.f217781c, (CacheDrawScope) obj2);
        }
    }

    public /* synthetic */ h0(long j2, Function0 function0, boolean z) {
        this.f217780b = j2;
        this.d = function0;
        this.f217781c = z;
    }

    public /* synthetic */ h0(pwa.m mVar, long j2, boolean z) {
        this.d = mVar;
        this.f217780b = j2;
        this.f217781c = z;
    }
}

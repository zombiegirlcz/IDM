package aem;

import com.fourthline.core.internal.TryKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f3735b;

    public /* synthetic */ j(int i, Function1 function1) {
        this.f3734a = i;
        this.f3735b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f3734a) {
            case 0:
                h install = (h) obj2;
                Intrinsics.checkNotNullParameter(install, "$this$install");
                this.f3735b.invoke(install);
                return Unit.f186387a;
            case 1:
                return TryKt.a(this.f3735b, obj2);
            default:
                jlm.a buffer = (jlm.a) obj2;
                Intrinsics.checkNotNullParameter(buffer, "buffer");
                while (true) {
                    Intrinsics.checkNotNullParameter(buffer, "<this>");
                    if (buffer.J()) {
                        return Boolean.TRUE;
                    }
                    this.f3735b.invoke(Byte.valueOf(buffer.readByte()));
                }
                break;
        }
    }
}

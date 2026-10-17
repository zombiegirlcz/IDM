package i84;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nu3.g f159440b;

    public /* synthetic */ h(nu3.g gVar, int i) {
        this.f159439a = i;
        this.f159440b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        e update = (e) obj2;
        switch (this.f159439a) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.getClass();
                nu3.g content = this.f159440b;
                Intrinsics.checkNotNullParameter(content, "content");
                return new e(content);
            default:
                update.getClass();
                nu3.g content2 = this.f159440b;
                Intrinsics.checkNotNullParameter(content2, "content");
                return new e(content2);
        }
    }
}

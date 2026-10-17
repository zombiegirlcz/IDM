package p30;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f232550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f232551b;

    public /* synthetic */ a(d dVar, int i) {
        this.f232550a = i;
        this.f232551b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        final File it8 = (File) obj2;
        switch (this.f232550a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                final int i = 0;
                final d dVar = this.f232551b;
                return new h(new kfm.a() { // from class: p30.c
                    @Override // kfm.a
                    public final void run() {
                        switch (i) {
                            case 0:
                                File file = it8;
                                Intrinsics.h(file);
                                dVar.a(file);
                                break;
                            default:
                                File file2 = it8;
                                Intrinsics.h(file2);
                                dVar.a(file2);
                                break;
                        }
                    }
                }, 2);
            case 1:
                Intrinsics.checkNotNullParameter(it8, "it");
                su9.c cVar = this.f232551b.d;
                String path = it8.getPath();
                Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
                return cVar.e(path);
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                final int i2 = 1;
                final d dVar2 = this.f232551b;
                return new h(new kfm.a() { // from class: p30.c
                    @Override // kfm.a
                    public final void run() {
                        switch (i2) {
                            case 0:
                                File file = it8;
                                Intrinsics.h(file);
                                dVar2.a(file);
                                break;
                            default:
                                File file2 = it8;
                                Intrinsics.h(file2);
                                dVar2.a(file2);
                                break;
                        }
                    }
                }, 2);
        }
    }
}

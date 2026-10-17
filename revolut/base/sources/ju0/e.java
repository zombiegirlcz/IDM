package ju0;

import androidx.media3.exoplayer.ExoPlayer;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import ju0.a;
import ju0.j;
import jv0.m;
import jv0.o;
import jv0.p;
import jv0.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.n;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f178554b;

    public /* synthetic */ e(j jVar, int i) {
        this.f178553a = i;
        this.f178554b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f178553a;
        a.C1014a c1014a = a.C1014a.f178545a;
        j jVar = this.f178554b;
        switch (i) {
            case 0:
                m it8 = (m) obj2;
                j.a aVar = j.Companion;
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            case 1:
                m mVar = (m) obj2;
                j.a aVar2 = j.Companion;
                Intrinsics.h(mVar);
                WallpaperAssetSwitcher wallpaperAssetSwitcher = jVar.f178561a;
                ihm.f fVar = jVar.e;
                if (mVar instanceof o) {
                    o oVar = (o) mVar;
                    fVar.onNext(new c(oVar.f178755a, oVar.f178756b, oVar.f178757c));
                } else if (mVar instanceof m.c) {
                    ExoPlayer exoPlayer = wallpaperAssetSwitcher.f59491a.f57712n;
                    boolean zJ = pd.b.j(exoPlayer != null ? Boolean.valueOf(exoPlayer.isPlaying()) : null);
                    long contentPosition = wallpaperAssetSwitcher.getContentPosition();
                    long j2 = contentPosition < 0 ? 0L : contentPosition;
                    long contentDuration = wallpaperAssetSwitcher.getContentDuration();
                    fVar.onNext(new c(zJ, j2, contentDuration < 0 ? 0L : contentDuration));
                } else if (mVar instanceof p) {
                    fVar.onNext(new b(((p) mVar).f178758a));
                } else if (mVar instanceof m.a) {
                    jVar.f178565h = true;
                    jVar.a();
                    fVar.onNext(c1014a);
                } else if (mVar instanceof q) {
                    oz0.a aVar3 = ((q) mVar).f178759a;
                    fVar.onNext(new a.b(aVar3 != null ? aVar3.f231099c : null));
                }
                break;
            case 2:
                a it9 = (a) obj2;
                j.a aVar4 = j.Companion;
                Intrinsics.checkNotNullParameter(it9, "it");
                break;
            case 3:
                a aVar5 = (a) obj2;
                j.a aVar6 = j.Companion;
                Intrinsics.h(aVar5);
                jVar.e.onNext(aVar5);
                break;
            default:
                ihm.f fVar2 = jVar.e;
                j.a aVar7 = j.Companion;
                if (((yhm.m) obj2).f314193a instanceof n) {
                    fVar2.onNext(new a.b(null));
                } else {
                    jVar.f178564g = true;
                    jVar.a();
                    fVar2.onNext(c1014a);
                    if (jVar.i.f169236c) {
                        jVar.d.b();
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}

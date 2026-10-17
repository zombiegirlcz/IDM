package pv9;

import android.content.Context;
import androidx.media3.exoplayer.source.ProgressiveMediaExtractor;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.work.impl.WorkDatabase;
import com.revolut.core.ui_kit.internal.views.stories.StoryPagesView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.data.model.Data;
import com.revolut.feature.remote_stories.impl.ui.RemoteStoriesActivity;
import com.revolut.feature.stories.StoriesActivity;
import com.revolut.utils.job.workers.ProfileLocationWorker;
import efm.h0;
import efm.w;
import java.util.List;
import kfm.o;
import kfm.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import no.f2;
import org.reactivestreams.Publisher;
import qza.q;
import rp0.a0;
import v3e.n;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class b implements o, kfm.c, kfm.g, SupportSQLiteOpenHelper.Factory, ProgressiveMediaExtractor.Factory, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f240017b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f240016a = i;
        this.f240017b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f240016a;
        Object obj3 = this.f240017b;
        switch (i) {
            case 5:
                ((qe0.a) obj3).invoke(obj2);
                break;
            case 10:
                KProperty[] kPropertyArr = RemoteStoriesActivity.f81953v0;
                ((f2) obj3).invoke(obj2);
                break;
            case 17:
                StoryPagesView.Companion aVar = StoryPagesView.INSTANCE;
                ((ru0.c) obj3).invoke(obj2);
                break;
            case 19:
                ((bsi.b) obj3).invoke(obj2);
                break;
            case 21:
                ((ald.o) obj3).invoke(obj2);
                break;
            default:
                int i2 = BasicNavBar.H;
                ((f2) obj3).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f240016a;
        Object obj2 = this.f240017b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((f2) obj2).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((jli.f) obj2).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((f2) obj2).invoke(p0);
            case 3:
            case 5:
            case 10:
            case 15:
            case 17:
            case 19:
            case 21:
            case 22:
            case 23:
            case 27:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((n) obj2).invoke(p0);
            case 4:
                ProfileLocationWorker.Companion aVar = ProfileLocationWorker.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((f2) obj2).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) ((bsi.b) obj2).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) ((qe0.a) obj2).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((qm.b) obj2).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((qm.b) obj2).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((qza.p) obj2).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((bsi.b) obj2).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((q) obj2).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((qza.p) obj2).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (a0) ((f2) obj2).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((rwh.a) obj2).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((f2) obj2).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((q) obj2).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((u7l.a) obj2).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) ((f2) obj2).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((v3e.p) obj2).invoke(p0);
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        return WorkDatabase.Companion.create$lambda$0((Context) this.f240017b, configuration);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        q qVar = (q) this.f240017b;
        KProperty[] kPropertyArr = StoriesActivity.f88741w0;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) qVar.invoke(p0)).booleanValue();
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        pq0.d dVar = (pq0.d) this.f240017b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (pza.h) dVar.invoke(p0, p17);
    }
}

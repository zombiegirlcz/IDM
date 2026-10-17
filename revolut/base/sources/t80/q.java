package t80;

import com.revolut.core.android.utils.file.FileTooLargeException;
import com.revolut.core.android.utils.file.InvalidFileNameException;
import com.revolut.core.android.utils.file.InvalidFileTypeException;
import com.revolut.core.android.utils.file.MissingFileExtensionException;
import com.revolut.media.picker.MediaPickerException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import t80.m;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class q implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f268774a;

    public q(h listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f268774a = listener;
    }

    public final void a(Throwable e, l source) {
        m oVar;
        m mVar;
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(source, "source");
        if (e instanceof MediaPickerException) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
        } else {
            Intrinsics.checkNotNullParameter("Unexpected media picker error", "message");
            MediaPickerException mediaPickerException = new MediaPickerException("Unexpected media picker error", e);
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, mediaPickerException, h0Var2);
        }
        if (e instanceof InvalidFileNameException) {
            mVar = m.b.f268768a;
        } else if (e instanceof MissingFileExtensionException) {
            mVar = m.c.f268769a;
        } else {
            if (e instanceof FileTooLargeException) {
                oVar = new n(((FileTooLargeException) e).f51213a);
            } else if (e instanceof InvalidFileTypeException) {
                mVar = m.e.f268771a;
            } else {
                oVar = new o(e);
            }
            mVar = oVar;
        }
        this.f268774a.p(mVar);
    }
}

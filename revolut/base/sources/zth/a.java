package zth;

import com.revolut.feature.workflow.engine.rfi.api.interactor.UploadState;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f325166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UploadState f325167c;

    public a(String questionId, File file, UploadState state) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f325165a = questionId;
        this.f325166b = file;
        this.f325167c = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f325165a, aVar.f325165a) && Intrinsics.f(this.f325166b, aVar.f325166b) && Intrinsics.f(this.f325167c, aVar.f325167c);
    }

    public final int hashCode() {
        return this.f325167c.hashCode() + ((this.f325166b.hashCode() + (this.f325165a.hashCode() * 31)) * 31);
    }
}

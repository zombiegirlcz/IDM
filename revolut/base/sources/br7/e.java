package br7;

import com.revolut.feature.insurance_car.impl.data.model.RequestedDocument;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RequestedDocument f17935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f17936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f17937c;

    public e(RequestedDocument document, f mode, List files) {
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(files, "files");
        this.f17935a = document;
        this.f17936b = mode;
        this.f17937c = files;
    }

    public static e a(e eVar, ArrayList files) {
        RequestedDocument document = eVar.f17935a;
        f mode = eVar.f17936b;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(files, "files");
        return new e(document, mode, files);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f17935a, eVar.f17935a) && this.f17936b == eVar.f17936b && Intrinsics.f(this.f17937c, eVar.f17937c);
    }

    public final int hashCode() {
        return this.f17937c.hashCode() + ((this.f17936b.hashCode() + (this.f17935a.hashCode() * 31)) * 31);
    }
}

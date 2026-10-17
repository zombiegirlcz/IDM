package fzl;

import android.text.Editable;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Pattern f139239b;

    @Override // fzl.c
    public final boolean a(Editable text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return this.f139239b.matcher(text).matches();
    }
}

package jl;

import com.onfido.api.client.data.DocType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class f0 {

    @NotNull
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocType f175532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f175533b;

    public /* synthetic */ f0(int i, DocType docType, String str) {
        if (3 != (i & 3)) {
            qlm.j1.f(d0.f175528a.getDescriptor(), i, 3);
            throw null;
        }
        this.f175532a = docType;
        this.f175533b = str;
    }
}

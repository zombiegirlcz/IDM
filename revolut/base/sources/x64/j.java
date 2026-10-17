package x64;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements cli.j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ax4.b f303039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f303040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f303041c;

    public j(ax4.b constructorState, Data contentData, boolean z) {
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        Intrinsics.checkNotNullParameter(contentData, "contentData");
        this.f303039a = constructorState;
        this.f303040b = contentData;
        this.f303041c = z;
    }

    public static j a(j jVar, ax4.b constructorState, Data contentData, int i) {
        if ((i & 1) != 0) {
            constructorState = jVar.f303039a;
        }
        if ((i & 2) != 0) {
            contentData = jVar.f303040b;
        }
        boolean z = (i & 4) != 0 ? jVar.f303041c : true;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        Intrinsics.checkNotNullParameter(contentData, "contentData");
        return new j(constructorState, contentData, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f303039a, jVar.f303039a) && Intrinsics.f(this.f303040b, jVar.f303040b) && this.f303041c == jVar.f303041c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f303041c) + kii.e.c(this.f303040b, this.f303039a.hashCode() * 31, 31);
    }
}

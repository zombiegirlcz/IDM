package md9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f204533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f204534b;

    public e() {
        this(0);
    }

    public static e a(e eVar, Data lockedPromptModel, boolean z, int i) {
        if ((i & 1) != 0) {
            lockedPromptModel = eVar.f204533a;
        }
        if ((i & 2) != 0) {
            z = eVar.f204534b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(lockedPromptModel, "lockedPromptModel");
        return new e(lockedPromptModel, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f204533a, eVar.f204533a) && this.f204534b == eVar.f204534b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f204534b) + (this.f204533a.hashCode() * 31);
    }

    public e(Data lockedPromptModel, boolean z) {
        Intrinsics.checkNotNullParameter(lockedPromptModel, "lockedPromptModel");
        this.f204533a = lockedPromptModel;
        this.f204534b = z;
    }

    public /* synthetic */ e(int i) {
        this(new Data(null, null, true, 3, null), false);
    }
}

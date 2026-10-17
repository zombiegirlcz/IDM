package ge0;

import android.database.Cursor;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.b0;
import kotlinx.serialization.internal.EnumDescriptor;
import olm.h;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements Iterable, pim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f143205b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f143204a = i;
        this.f143205b = obj2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f143204a) {
            case 0:
                return new a(this, 0);
            case 1:
                String str = (String) this.f143205b;
                Intrinsics.checkNotNullParameter(str, "<this>");
                return new b0(str);
            case 2:
                return ((Sequence) this.f143205b).iterator();
            default:
                return new h((EnumDescriptor) this.f143205b);
        }
    }

    public b(Cursor cursor) {
        this.f143204a = 0;
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        this.f143205b = cursor;
    }
}

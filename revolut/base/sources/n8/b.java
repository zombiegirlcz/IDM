package n8;

import com.bumptech.glide.o;
import y8.f;

/* JADX INFO: loaded from: classes16.dex */
public final class b extends o {
    public static b b() {
        b bVar = new b();
        bVar.f26141a = new w8.a(300, false);
        return bVar;
    }

    public static b c(w8.a aVar) {
        b bVar = new b();
        f.c(aVar, "Argument must not be null");
        bVar.f26141a = aVar;
        return bVar;
    }

    @Override // com.bumptech.glide.o
    public final boolean equals(Object obj2) {
        return (obj2 instanceof b) && super.equals(obj2);
    }
}

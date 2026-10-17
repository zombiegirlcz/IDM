package vk5;

import a4b.i;
import com.revolut.data.model.Data;
import dl3.f;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vgg.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements xj5.c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f289861a;

    public c(f contactsMapper) {
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        this.f289861a = contactsMapper;
    }

    public final List a(Data contactsData, String searchQuery, boolean z) {
        Intrinsics.checkNotNullParameter(contactsData, "contactsData");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return (List) iii.c.f(contactsData, new vjk.b(this, 1), new a0(22), new i(this, z, searchQuery, 17));
    }
}

package bx0;

import android.content.Context;
import com.revolut.core.ui_kit.storiesdelegates.BaseStoriesDelegate;
import com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel;
import com.revolut.core.ui_kit.storiesdelegates.MetadataStoriesModel;
import com.revolut.core.ui_kit.storiesdelegates.MetadataStoriesPageDelegate;
import com.revolut.core.ui_kit.storiesdelegates.StickerStoriesModel;
import com.revolut.core.ui_kit.storiesdelegates.StickerStoriesPageDelegate;

/* JADX INFO: loaded from: classes19.dex */
public final class o extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19437c;
    public final /* synthetic */ BaseStoriesDelegate d;
    public final /* synthetic */ BaseStoriesModel e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(BaseStoriesDelegate baseStoriesDelegate, BaseStoriesModel baseStoriesModel, Context context, int i) {
        super(context, true);
        this.f19437c = i;
        this.d = baseStoriesDelegate;
        this.e = baseStoriesModel;
    }

    @Override // bx0.r
    public final void a() {
        switch (this.f19437c) {
            case 0:
                ((MetadataStoriesPageDelegate) this.d).f.invoke((MetadataStoriesModel) this.e);
                break;
            default:
                ((StickerStoriesPageDelegate) this.d).f.invoke((StickerStoriesModel) this.e);
                break;
        }
    }
}

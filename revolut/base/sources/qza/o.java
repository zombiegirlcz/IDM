package qza;

import android.os.Parcelable;
import android.webkit.MimeTypeMap;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.remote_stories.impl.R$string;
import com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$RemoteStoriesModel;
import com.revolut.feature.remote_stories.impl.ui.RemoteStoriesMapper$RemoteStoryParcel;
import com.revolut.feature.remote_stories.impl.ui.StoriesEventsMetadata;
import com.revolut.feature.remote_stories.models.params.RemoteStoryModelParams;
import com.revolut.feature.stories.models.ButtonStyle;
import com.revolut.feature.stories.models.ColourScheme;
import com.revolut.feature.stories.models.PageBackground;
import com.revolut.feature.stories.models.StoriesModel;
import com.revolut.feature.stories.models.StoryPage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import zhm.q0;

/* JADX INFO: loaded from: classes13.dex */
public final class o {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c90.c f250470a;

    public o(c90.c uiResources) {
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.f250470a = uiResources;
    }

    public static a4e.a b(tza.a aVar) {
        int i = n.f250469c[aVar.ordinal()];
        if (i == 1) {
            return a4e.a.WHITE;
        }
        if (i == 2) {
            return a4e.a.BLACK;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final RemoteStoriesContract$RemoteStoriesModel a(mza.i storyRequestParams, mza.d remoteStory, RemoteStoryModelParams remoteStoryModelParams, StoriesEventsMetadata storiesEventsMetadata) {
        Iterator it8;
        TextClause textClause;
        a4e.b bVar;
        PageBackground.ImageSource imageSource;
        String str;
        ButtonStyle buttonStyle;
        ColourScheme colourScheme;
        Parcelable simple;
        a4e.b bVar2;
        int i;
        ButtonStyle buttonStyle2;
        ColourScheme colourScheme2;
        Intrinsics.checkNotNullParameter(storyRequestParams, "storyRequestParams");
        Intrinsics.checkNotNullParameter(remoteStory, "remoteStory");
        Intrinsics.checkNotNullParameter(remoteStoryModelParams, "remoteStoryModelParams");
        String str2 = storyRequestParams.f210742a;
        mza.f fVar = remoteStory.f210730a;
        ArrayList arrayList = remoteStory.f210731b;
        String str3 = fVar.f210735a;
        if (str3 == null) {
            str3 = "";
        }
        TextClause textClause2 = new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it9 = arrayList.iterator();
        boolean z = false;
        int i2 = 0;
        while (it9.hasNext()) {
            Object next = it9.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                zhm.v.s();
                throw null;
            }
            mza.g gVar = (mza.g) next;
            String strK = com.google.android.gms.internal.mlkit_vision_face.a.k(i2, str2, "_");
            String str4 = gVar.f210739c;
            ArrayList arrayList3 = gVar.d;
            mza.h hVar = gVar.e;
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str4));
            if (mimeTypeFromExtension != null ? kotlin.text.d0.J(mimeTypeFromExtension, "video", z) : z) {
                TextClause textClause3 = new TextClause(gVar.f210737a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TextClause textClause4 = new TextClause(gVar.f210738b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                PageBackground.VideoSource videoSource = new PageBackground.VideoSource(new UrlVideo(gVar.f210739c, (String) null, false, oz0.b.CENTER_CROP, false, (oz0.c) null, LDSFile.EF_DG4_TAG), -16777216, true, false, false);
                int i5 = n.f250467a[hVar.f210740a.ordinal()];
                if (i5 == 1) {
                    bVar2 = a4e.b.VERTICAL;
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar2 = a4e.b.HORIZONTAL;
                }
                a4e.b bVar3 = bVar2;
                mza.e eVar = (mza.e) zhm.d0.d0(arrayList3);
                if (eVar != null) {
                    it8 = it9;
                    textClause = textClause2;
                    buttonStyle2 = new ButtonStyle(new TextLocalisedClause(R$string.communication_story_action_title, zhm.u.c(eVar.f210733b), null, 12), remoteStoryModelParams.f82015c.f82012b, b(remoteStoryModelParams.f82015c.f82011a), new AnalyticsContext(v0.a.b("action0", AnalyticsContext.INSTANCE)));
                    i = 1;
                } else {
                    it8 = it9;
                    textClause = textClause2;
                    i = 1;
                    buttonStyle2 = null;
                }
                mza.e eVar2 = (mza.e) zhm.d0.e0(i, arrayList3);
                ButtonStyle buttonStyle3 = eVar2 != null ? new ButtonStyle(new TextLocalisedClause(R$string.communication_story_action_title, zhm.u.c(eVar2.f210733b), null, 12), remoteStoryModelParams.d.f82012b, b(remoteStoryModelParams.d.f82011a), new AnalyticsContext(v0.a.b("action1", AnalyticsContext.INSTANCE))) : null;
                mza.b bVar4 = hVar.f210741b;
                if (bVar4 != null) {
                    int i6 = n.f250468b[bVar4.ordinal()];
                    if (i6 == 1) {
                        colourScheme2 = ColourScheme.LightScheme.f88765l;
                    } else {
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        colourScheme2 = ColourScheme.DarkScheme.f88764l;
                    }
                } else {
                    colourScheme2 = ColourScheme.DarkScheme.f88764l;
                }
                simple = new StoryPage.WithVideo(strK, textClause3, textClause4, null, buttonStyle2, buttonStyle3, bVar3, null, videoSource, null, colourScheme2);
                str = str2;
            } else {
                it8 = it9;
                textClause = textClause2;
                TextClause textClause5 = new TextClause(gVar.f210737a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TextClause textClause6 = new TextClause(gVar.f210738b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                PageBackground.ImageSource imageSource2 = new PageBackground.ImageSource(kli.a.s(R$attr.uikit_colorDeepGrey, this.f250470a.f22265a), new UrlImage(gVar.f210739c, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations((CircleTransformation) null, true, false, (Integer) null, (Integer) null, (Integer) null, 507), null, null, false, true, 245758), false);
                int i21 = n.f250467a[hVar.f210740a.ordinal()];
                if (i21 == 1) {
                    bVar = a4e.b.VERTICAL;
                } else {
                    if (i21 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = a4e.b.HORIZONTAL;
                }
                a4e.b bVar5 = bVar;
                mza.e eVar3 = (mza.e) zhm.d0.d0(arrayList3);
                if (eVar3 != null) {
                    imageSource = imageSource2;
                    str = str2;
                    buttonStyle = new ButtonStyle(new TextLocalisedClause(R$string.communication_story_action_title, zhm.u.c(eVar3.f210733b), null, 12), remoteStoryModelParams.f82015c.f82012b, b(remoteStoryModelParams.f82015c.f82011a), new AnalyticsContext(v0.a.b("action0", AnalyticsContext.INSTANCE)));
                } else {
                    imageSource = imageSource2;
                    str = str2;
                    buttonStyle = null;
                }
                mza.e eVar4 = (mza.e) zhm.d0.e0(1, arrayList3);
                ButtonStyle buttonStyle4 = eVar4 != null ? new ButtonStyle(new TextLocalisedClause(R$string.communication_story_action_title, zhm.u.c(eVar4.f210733b), null, 12), remoteStoryModelParams.d.f82012b, b(remoteStoryModelParams.d.f82011a), new AnalyticsContext(v0.a.b("action1", AnalyticsContext.INSTANCE))) : null;
                mza.b bVar6 = hVar.f210741b;
                if (bVar6 != null) {
                    int i22 = n.f250468b[bVar6.ordinal()];
                    if (i22 == 1) {
                        colourScheme = ColourScheme.LightScheme.f88765l;
                    } else {
                        if (i22 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        colourScheme = ColourScheme.DarkScheme.f88764l;
                    }
                } else {
                    colourScheme = ColourScheme.DarkScheme.f88764l;
                }
                simple = new StoryPage.Simple(strK, textClause5, textClause6, imageSource, buttonStyle, buttonStyle4, null, bVar5, null, colourScheme);
            }
            arrayList2.add(simple);
            i2 = i3;
            str2 = str;
            it9 = it8;
            textClause2 = textClause;
            z = false;
        }
        StoriesModel storiesModel = new StoriesModel(textClause2, str2, arrayList2, remoteStoryModelParams.f82014b, new RemoteStoriesMapper$RemoteStoryParcel(storyRequestParams.f210742a, storiesEventsMetadata), remoteStoryModelParams.f82013a, remoteStoryModelParams.e, 0);
        ArrayList<Pair> arrayList4 = new ArrayList(zhm.w.t(arrayList, 10));
        int i32 = 0;
        for (Object obj2 : arrayList) {
            int i33 = i32 + 1;
            if (i32 < 0) {
                zhm.v.s();
                throw null;
            }
            String strK2 = com.google.android.gms.internal.mlkit_vision_face.a.k(i32, str2, "_");
            ArrayList arrayList5 = ((mza.g) obj2).d;
            ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
            Iterator it10 = arrayList5.iterator();
            while (it10.hasNext()) {
                arrayList6.add(((mza.e) it10.next()).f210734c);
            }
            arrayList4.add(new Pair(strK2, arrayList6));
            i32 = i33;
        }
        int iB = q0.b(zhm.w.t(arrayList4, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Pair pair : arrayList4) {
            linkedHashMap.put(pair.f186385a, pair.f186386b);
        }
        return new RemoteStoriesContract$RemoteStoriesModel(storiesModel, remoteStory.f210730a.f210736b, linkedHashMap);
    }
}

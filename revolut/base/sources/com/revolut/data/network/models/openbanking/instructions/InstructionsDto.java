package com.revolut.data.network.models.openbanking.instructions;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/revolut/data/network/models/openbanking/instructions/InstructionsDto;", "", "title", "", "subtitle", "secondaryButton", "Lcom/revolut/data/network/models/openbanking/instructions/InstructionsSecondaryButtonDto;", "sections", "", "Lcom/revolut/data/network/models/openbanking/instructions/InstructionsSectionDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/openbanking/instructions/InstructionsSecondaryButtonDto;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getSecondaryButton", "()Lcom/revolut/data/network/models/openbanking/instructions/InstructionsSecondaryButtonDto;", "getSections", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstructionsDto {

    @b("secondaryButton")
    private final InstructionsSecondaryButtonDto secondaryButton;

    @b("sections")
    private final List<InstructionsSectionDto> sections;

    @b("subtitle")
    private final String subtitle;

    @b("title")
    @NotNull
    private final String title;

    public InstructionsDto(@NotNull String title, String str, InstructionsSecondaryButtonDto instructionsSecondaryButtonDto, List<InstructionsSectionDto> list) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subtitle = str;
        this.secondaryButton = instructionsSecondaryButtonDto;
        this.sections = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InstructionsDto copy$default(InstructionsDto instructionsDto, String str, String str2, InstructionsSecondaryButtonDto instructionsSecondaryButtonDto, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = instructionsDto.title;
        }
        if ((i & 2) != 0) {
            str2 = instructionsDto.subtitle;
        }
        if ((i & 4) != 0) {
            instructionsSecondaryButtonDto = instructionsDto.secondaryButton;
        }
        if ((i & 8) != 0) {
            list = instructionsDto.sections;
        }
        return instructionsDto.copy(str, str2, instructionsSecondaryButtonDto, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final InstructionsSecondaryButtonDto getSecondaryButton() {
        return this.secondaryButton;
    }

    public final List<InstructionsSectionDto> component4() {
        return this.sections;
    }

    @NotNull
    public final InstructionsDto copy(@NotNull String title, String subtitle, InstructionsSecondaryButtonDto secondaryButton, List<InstructionsSectionDto> sections) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new InstructionsDto(title, subtitle, secondaryButton, sections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstructionsDto)) {
            return false;
        }
        InstructionsDto instructionsDto = (InstructionsDto) other;
        return Intrinsics.f(this.title, instructionsDto.title) && Intrinsics.f(this.subtitle, instructionsDto.subtitle) && Intrinsics.f(this.secondaryButton, instructionsDto.secondaryButton) && Intrinsics.f(this.sections, instructionsDto.sections);
    }

    public final InstructionsSecondaryButtonDto getSecondaryButton() {
        return this.secondaryButton;
    }

    public final List<InstructionsSectionDto> getSections() {
        return this.sections;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        InstructionsSecondaryButtonDto instructionsSecondaryButtonDto = this.secondaryButton;
        int iHashCode3 = (iHashCode2 + (instructionsSecondaryButtonDto == null ? 0 : instructionsSecondaryButtonDto.hashCode())) * 31;
        List<InstructionsSectionDto> list = this.sections;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }
}

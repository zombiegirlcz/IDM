package com.github.devnied.emvnfccard.iso7816emv.impl;

import com.github.devnied.emvnfccard.enums.TagTypeEnum;
import com.github.devnied.emvnfccard.enums.TagValueTypeEnum;
import com.github.devnied.emvnfccard.iso7816emv.ITag;
import fr.devnied.bitlib.BytesUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public final class TagImpl implements ITag {
    private final String description;
    private final byte[] idBytes;
    public final String name;
    private final ITag.Class tagClass;
    private final TagValueTypeEnum tagValueType;
    private final TagTypeEnum type;

    public TagImpl(String str, TagValueTypeEnum tagValueTypeEnum, String str2, String str3) {
        this(BytesUtils.fromString(str), tagValueTypeEnum, str2, str3);
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof ITag)) {
            return false;
        }
        ITag iTag = (ITag) obj2;
        if (getTagBytes().length != iTag.getTagBytes().length) {
            return false;
        }
        return Arrays.equals(getTagBytes(), iTag.getTagBytes());
    }

    @Override // com.github.devnied.emvnfccard.iso7816emv.ITag
    public String getDescription() {
        return this.description;
    }

    @Override // com.github.devnied.emvnfccard.iso7816emv.ITag
    public String getName() {
        return this.name;
    }

    @Override // com.github.devnied.emvnfccard.iso7816emv.ITag
    public int getNumTagBytes() {
        return this.idBytes.length;
    }

    @Override // com.github.devnied.emvnfccard.iso7816emv.ITag
    public byte[] getTagBytes() {
        return this.idBytes;
    }

    @Override // com.github.devnied.emvnfccard.iso7816emv.ITag
    public ITag.Class getTagClass() {
        return this.tagClass;
    }

    @Override // com.github.devnied.emvnfccard.iso7816emv.ITag
    public TagValueTypeEnum getTagValueType() {
        return this.tagValueType;
    }

    @Override // com.github.devnied.emvnfccard.iso7816emv.ITag
    public TagTypeEnum getType() {
        return this.type;
    }

    public int hashCode() {
        return Arrays.hashCode(this.idBytes) + 177;
    }

    @Override // com.github.devnied.emvnfccard.iso7816emv.ITag
    public boolean isConstructed() {
        return this.type == TagTypeEnum.CONSTRUCTED;
    }

    public String toString() {
        return "Tag[" + BytesUtils.bytesToString(getTagBytes()) + "] Name=" + getName() + ", TagType=" + getType() + ", ValueType=" + getTagValueType() + ", Class=" + this.tagClass;
    }

    public TagImpl(byte[] bArr, TagValueTypeEnum tagValueTypeEnum, String str, String str2) {
        if (bArr == null) {
            throw new IllegalArgumentException("Param id cannot be null");
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("Param id cannot be empty");
        }
        if (tagValueTypeEnum == null) {
            throw new IllegalArgumentException("Param tagValueType cannot be null");
        }
        this.idBytes = bArr;
        this.name = str;
        this.description = str2;
        this.tagValueType = tagValueTypeEnum;
        if (BytesUtils.matchBitByBitIndex(bArr[0], 5)) {
            this.type = TagTypeEnum.CONSTRUCTED;
        } else {
            this.type = TagTypeEnum.PRIMITIVE;
        }
        byte b4 = (byte) ((bArr[0] >>> 6) & 3);
        if (b4 == 1) {
            this.tagClass = ITag.Class.APPLICATION;
            return;
        }
        if (b4 == 2) {
            this.tagClass = ITag.Class.CONTEXT_SPECIFIC;
        } else if (b4 != 3) {
            this.tagClass = ITag.Class.UNIVERSAL;
        } else {
            this.tagClass = ITag.Class.PRIVATE;
        }
    }
}
